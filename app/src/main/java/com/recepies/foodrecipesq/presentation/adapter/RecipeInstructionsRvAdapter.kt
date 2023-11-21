package com.recepies.foodrecipesq.presentation.adapter

import android.view.LayoutInflater
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.ViewDataBinding
import com.recepies.foodrecipesq.R
import com.recepies.recipecore.data.model.Step
import com.recepies.foodrecipesq.databinding.RecipeInstructionItemBinding
import com.recepies.foodrecipesq.domain.utils.CommonAdapter
import com.recepies.foodrecipesq.domain.utils.Utility

class RecipeInstructionsRvAdapter :CommonAdapter<Step>() {
    override fun bind(viewbinding: ViewDataBinding, position: Int) {
        val data = differ.currentList[position]
        val recipeInstructionItemBinding = viewbinding as RecipeInstructionItemBinding
        bindData(data,position,recipeInstructionItemBinding)
    }

    private fun bindData(
        data: Step?,
        position: Int,
        recipeInstructionItemBinding: RecipeInstructionItemBinding
    ) {
        data?.let {step ->
            recipeInstructionItemBinding.stepTv.text = "Step ${step.number}"
            recipeInstructionItemBinding.ingredientTv.text = step.step
            recipeInstructionItemBinding.description.removeAllViews()
            step.ingredients?.forEach {
                val item = LayoutInflater.from(recipeInstructionItemBinding.root.context).inflate(R.layout.meal_type_chip_item,null)
                val titleTv = item.findViewById<TextView>(R.id.chip_title)
                titleTv.text = it.name
                titleTv.setTextColor(ContextCompat.getColor(recipeInstructionItemBinding.root.context,R.color.ads_303030))
                titleTv.background = Utility.getCustomGradient(16,1,"#d7d7d7","#ffffff")
                recipeInstructionItemBinding.description.addView(item)
            }

        }
    }

    override fun getlayout(position: Int): Int {
        return R.layout.recipe_instruction_item
    }
}