package uz.coder.muslimcalendar.model.sealed

sealed class Screen(val route:String) {
    data object Home:Screen(HOME)
    data object ChooseRegion:Screen(CHOOSE_REGION)

    companion object{
        private const val HOME = "home"
        private const val CHOOSE_REGION = "choose_region"
    }

}