package com.example.fragmentstest

class Fragment3 : BaseFragment() {
    override fun getLayoutId() = R.layout.fragment3

    override fun initViews() {
    }

    companion object {
        fun getInstance(router: Router) = Fragment3().apply {
            this.router = router
        }
    }
}