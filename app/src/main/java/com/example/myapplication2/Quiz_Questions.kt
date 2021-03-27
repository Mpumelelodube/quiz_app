package com.example.myapplication2

import android.content.Intent
import android.graphics.Color
import android.graphics.Typeface
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import com.example.myapplication2.Constants.SELECTED_GAME
import kotlinx.android.synthetic.main.activity_quiz__questions.*

class Quiz_Questions : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition = 1
    private var mQuestionList : ArrayList<Question>? = null
    private  var mSelectedOptionPosition = 0
    private var mCorrectAnswers = 0

    private var mUsername: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz__questions)

        var selectedGame = intent.getStringExtra(SELECTED_GAME)

        when(selectedGame){
            "animal" -> {
                mQuestionList = Constants.getQuestions()

            }
            "flag" -> {
                mQuestionList = Constants.getFlagQuestions()

            }
            "color" -> {
                mQuestionList = Constants.getColorQuestions()

            }
        }

        setQuestions()

        option_one.setOnClickListener(this)
        option_two.setOnClickListener(this)
        option_three.setOnClickListener(this)
        option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)

        mUsername = intent.getStringExtra(Constants.USER_NAME)
    }

    private fun answerView(answer:Int, drawableView: Int){
        when(answer){
            1 -> {
                option_one.background = ContextCompat.getDrawable(this, drawableView)
            }
            2 -> {
                option_two.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                option_three.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 -> {
                option_four.background = ContextCompat.getDrawable(this, drawableView)
            }
        }
    }

    private fun setQuestions(){
        enableClickEventOnAnswerOptions()
        var questionObject = mQuestionList!![mCurrentPosition - 1]

        progress_bar.progress = mCurrentPosition
        text_progress.text = "${mCurrentPosition} / ${progress_bar.max}"

        question.text = questionObject.question
        flag_image.setImageResource(questionObject.image)

        option_one.text = questionObject.optionOne
        option_two.text = questionObject.optionTwo
        option_three.text = questionObject.optionThree
        option_four.text = questionObject.optionFour

        defaultOptionsView()

        if (mCurrentPosition == mQuestionList!!.size){
            btn_submit.text = "Finish"
        }else{
            btn_submit.text = "Submit"
        }
    }

    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        options.add(0, option_one)
        options.add(1, option_two)
        options.add(2, option_three)
        options.add(3, option_four)

        for (option in options){
            option.setTextColor(Color.parseColor("#7a8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
        }
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.option_one ->{
                selectedOptionView(option_one, 1)
            }
            R.id.option_two ->{
                selectedOptionView(option_two, 2)
            }
            R.id.option_three ->{
                selectedOptionView(option_three, 3)
            }
            R.id.option_four ->{
                selectedOptionView(option_four, 4)
            }
            R.id.btn_submit ->{
                disableClickEventOnAnswerOptions()
                if (mSelectedOptionPosition == 0 ){
                    mCurrentPosition ++

                    when{
                        mCurrentPosition <=mQuestionList!!.size -> {
                            setQuestions()
                        }else -> {
                            var intentResult = Intent(this,ResusltPage::class.java)
                            intentResult.putExtra(Constants.USER_NAME, mUsername)
                            intentResult.putExtra(Constants.CORRECT_ANSWERS, mCorrectAnswers)
                            intentResult.putExtra(Constants.TOTAL_QUESTIONS, mQuestionList!!.size)
                            startActivity(intentResult)
                            finish();
                        }
                    }
                }else{
                    val question = mQuestionList?.get(mCurrentPosition - 1)
                    if (question!!.correctAnswer != mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                        MediaPlayer.create(this, R.raw.wrong_answer).start()
                    }else{
                        mCorrectAnswers++
                        MediaPlayer.create(this, R.raw.correct_answer).start()
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)

                    if (mCurrentPosition == mQuestionList!!.size){
                        btn_submit.text = "Finish"
                    }else{
                        btn_submit.text = "Next Question"
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }
    }

    private fun selectedOptionView(tv:TextView, selectedOptionNumber: Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNumber

        tv.setTextColor(Color.parseColor("#363a43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)
    }

    private fun disableClickEventOnAnswerOptions(){
        option_one.isClickable = false
        option_two.isClickable = false
        option_three.isClickable = false
        option_four.isClickable = false
    }

    private fun enableClickEventOnAnswerOptions(){
        option_one.isClickable = true
        option_two.isClickable = true
        option_three.isClickable = true
        option_four.isClickable = true
    }
}
