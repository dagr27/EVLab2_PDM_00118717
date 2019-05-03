package com.diegoveega.evlab2_pdm_00118717

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.diegoveega.evlab2_pdm_00118717.Fragments.Button
import com.diegoveega.evlab2_pdm_00118717.Fragments.colors
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() ,Button.ButtonListener{

    override fun onClick(nav_direction: String) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    /*private fun setInitialFragment(){
        supportFragmentManager.beginTransaction().replace(R.id.abajo, colors.newInstance(R.id.c)).commit()
    }*/

    /*
     /*

      */
    private fun changeFragment(newFragment: ImageFragment){
        supportFragmentManager.beginTransaction().replace(R.id.activity_main_FrameLayout_imageFragmentHolder, newFragment).commit()
    }



    override fun onClick(nav_direction: String) {
        if(nav_direction == consts.left_ID){
            if(curr == 0){
                curr = 2
                changeFragment(fragment_list[curr])
            }
            else{
                curr -=1
                changeFragment(fragment_list[curr])
            }
        }
        if(nav_direction == consts.right_ID){
            if(curr == 2){
                curr = 0
                changeFragment(fragment_list[curr])
            }
            else{
                curr +=1
                changeFragment(fragment_list[curr])
            }
        }
}
    */

}
