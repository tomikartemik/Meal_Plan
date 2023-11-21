// Generated by data binding compiler. Do not edit!
package com.recepies.foodrecipesq.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.recepies.foodrecipesq.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RecipeInstructionLayoutBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView instructionRv;

  @NonNull
  public final NoResultUiBinding noStepsUi;

  protected RecipeInstructionLayoutBinding(Object _bindingComponent, View _root,
      int _localFieldCount, RecyclerView instructionRv, NoResultUiBinding noStepsUi) {
    super(_bindingComponent, _root, _localFieldCount);
    this.instructionRv = instructionRv;
    this.noStepsUi = noStepsUi;
  }

  @NonNull
  public static RecipeInstructionLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.recipe_instruction_layout, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RecipeInstructionLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RecipeInstructionLayoutBinding>inflateInternal(inflater, R.layout.recipe_instruction_layout, root, attachToRoot, component);
  }

  @NonNull
  public static RecipeInstructionLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.recipe_instruction_layout, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RecipeInstructionLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RecipeInstructionLayoutBinding>inflateInternal(inflater, R.layout.recipe_instruction_layout, null, false, component);
  }

  public static RecipeInstructionLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static RecipeInstructionLayoutBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (RecipeInstructionLayoutBinding)bind(component, view, R.layout.recipe_instruction_layout);
  }
}
