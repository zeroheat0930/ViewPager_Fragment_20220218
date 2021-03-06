package com.zeroheat.viewpager_fragment_20220218.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.zeroheat.viewpager_fragment_20220218.fragments.*


//부모 클래스에 ()햇는데도 에러가 난거면 기본값을 못받는 클래스기 때문에 그안에 값을 지정안해줘서다
//fragmentManager라는걸 받아오면됨
// 상속을 받았을때, 앞부분 에러 발생은 부모가 물려준 기능중 미완성인 기능이 있을때(추상 메쏘드)

class MainVIewPagerAdapter(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {


    override fun getPageTitle(position: Int): CharSequence? {
        return  when (position){
            0 -> "이름"
            1 -> "출생년도"
            2 -> "인사말"
            3 -> "기타1"
            else -> "기타2"
        }
    }






    //필수 오버라이딩 함수 2개
    //몇페이지 뷰페이저 인지 숫자 알려주셈
//    override fun getCount(): Int {
//        return 5
//    }
     override fun getCount() = 5


    // 각각의 position에 맞는 프래그먼트가 결과로 나가도록 리턴.
    override fun getItem(position: Int): Fragment {
        return when (position){
            0 -> {
                NameFragment()
            }
            1 -> {
                BirthYearFragment()
            }
            2 -> {
                HelloFragment()
            }
            3 -> {
                Etc1Fragment()
            }
            else -> Etc2Fragment()

        }

    }


}