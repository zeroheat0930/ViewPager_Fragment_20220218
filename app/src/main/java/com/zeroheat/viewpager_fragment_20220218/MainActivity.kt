package com.zeroheat.viewpager_fragment_20220218

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zeroheat.viewpager_fragment_20220218.adapters.MainVIewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //멤버변수설정
    lateinit var mAdapter : MainVIewPagerAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()

    }

    fun setupEvents() {

    }

    fun setValues() {

        // 어뎁터의 생성자를 호출할 떄 , 재료로 supportFragementManage를 넣어주자.
        mAdapter = MainVIewPagerAdapter( supportFragmentManager)

        // 메인화면에 있는 메인뷰 페이저의 어뎁터로 방금완성한 mAdapter를 넣어서 일시킬꺼야
        mainViewPager.adapter = mAdapter


        // 재사용성 무시하도록 하는 코드 예시(사용성 개선선)
        mainViewPager.offscreenPageLimit = 5


//        탭 레이아웃 / 뷰페이저 연결
        mainTabLayout.setupWithViewPager(mainViewPager)


    }


}