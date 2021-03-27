package com.example.myapplication2

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var mSelectedGame: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start_button.setOnClickListener(this)
        img_balloon.setOnClickListener(this)
        img_color.setOnClickListener(this)
        img_flag.setOnClickListener(this)
        img_lion.setOnClickListener(this)

        MediaPlayer.create(this, R.raw.main_menu).start()
    }


    override fun onClick(v: View?) {
       when(v?.id){
           R.id.start_button -> {
               if (entred_name.text.toString().isEmpty()){
                   Toast.makeText(this, "Please enter your name!", Toast.LENGTH_SHORT).show()
               }else{
                   if (mSelectedGame == null){
                       Toast.makeText(this, "Please Select a game!", Toast.LENGTH_SHORT).show()
                   }else{
                       val intent = Intent(this,Quiz_Questions::class.java)
                       intent.putExtra(Constants.USER_NAME, entred_name.text.toString())
                       intent.putExtra(Constants.SELECTED_GAME, mSelectedGame)
                       startActivity(intent)
                       finish();
                   }
               }
           }
           R.id.img_lion -> {
               selectedOptionView(img_lion, "animal")
           }
           R.id.img_flag -> {
               selectedOptionView(img_flag, "flag")
           }
           R.id.img_balloon -> {
               Toast.makeText(this, "Coming Soon!!!", Toast.LENGTH_SHORT).show()
           }
           R.id.img_color -> {
               selectedOptionView(img_color, "color")

           }
       }
    }

    private fun selectedOptionView(tv: ImageView, gameName: String){
        defaultOptionsView()
        mSelectedGame = gameName
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_img_bg)
    }

    private fun defaultOptionsView(){
        val options = ArrayList<ImageView>()
        options.add(0, img_lion)
        options.add(1, img_balloon)
        options.add(2, img_flag)
        options.add(3, img_color)

        for (option in options){
            option.background = ContextCompat.getDrawable(this, R.drawable.default_img_bg)
        }
    }
//
//    override fun onPause() {
//        super.onPause()
//        mp.stop()
//    }
//
//    override fun onStop() {
//        super.onStop()
//        mp.stop()
//    }
//
//    override fun onResume() {
//        super.onResume()
//        mp.stop()
//    }
//
//    override fun onRestart() {
//        super.onRestart()
//        mp.stop()
//    }
}
