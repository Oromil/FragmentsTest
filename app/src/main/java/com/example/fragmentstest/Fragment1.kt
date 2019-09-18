package com.example.fragmentstest

import kotlinx.android.synthetic.main.fragment1.*

class Fragment1 : BaseFragment() {

    override fun getLayoutId() = R.layout.fragment1

    override fun initViews() {
        btnGoNext.setOnClickListener { router.goToFrag2() }
    }

    companion object {
        fun getInstance(router: Router) = Fragment1().apply {
            this.router = router
        }
    }
}