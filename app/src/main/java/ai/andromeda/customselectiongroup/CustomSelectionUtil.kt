package ai.andromeda.customselectiongroup

import android.view.View
import android.view.ViewGroup

fun ViewGroup.clearSelection() {
    val numberOfChildViews = childCount
    try {
        for (index in 0..numberOfChildViews) {
            val child = getChildAt(index)
            child?.let {
                child.setBackgroundResource(R.drawable.outlined_card)
            }
        }
    } catch (e: Exception) {
        e.printStackTrace()
    }
}

fun ViewGroup.selectChild(v: View) {
    clearSelection()
    try {
        val child = getChildAt(indexOfChild(v))
        child.setBackgroundResource(R.drawable.outlined_card_selected)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}