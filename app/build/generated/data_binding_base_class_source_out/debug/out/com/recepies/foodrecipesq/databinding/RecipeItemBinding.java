// Generated by data binding compiler. Do not edit!
package com.recepies.foodrecipesq.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.recepies.foodrecipesq.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class RecipeItemBinding extends ViewDataBinding {
  @NonNull
  public final CardView cardView;

  @NonNull
  public final UserPrefItemLayoutBinding likeView;

  @NonNull
  public final TextView recipeDesc;

  @NonNull
  public final ImageView recipeImage;

  @NonNull
  public final TextView recipeTitle;

  @NonNull
  public final UserPrefItemLayoutBinding timeView;

  @NonNull
  public final UserPrefItemLayoutBinding vegView;

  @NonNull
  public final View verticalBarrier;

  protected RecipeItemBinding(Object _bindingComponent, View _root, int _localFieldCount,
      CardView cardView, UserPrefItemLayoutBinding likeView, TextView recipeDesc,
      ImageView recipeImage, TextView recipeTitle, UserPrefItemLayoutBinding timeView,
      UserPrefItemLayoutBinding vegView, View verticalBarrier) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cardView = cardView;
    this.likeView = likeView;
    this.recipeDesc = recipeDesc;
    this.recipeImage = recipeImage;
    this.recipeTitle = recipeTitle;
    this.timeView = timeView;
    this.vegView = vegView;
    this.verticalBarrier = verticalBarrier;
  }

  @NonNull
  public static RecipeItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.recipe_item, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static RecipeItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<RecipeItemBinding>inflateInternal(inflater, R.layout.recipe_item, root, attachToRoot, component);
  }

  @NonNull
  public static RecipeItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.recipe_item, null, false, component)
   */
  @NonNull
  @Deprecated
  public static RecipeItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<RecipeItemBinding>inflateInternal(inflater, R.layout.recipe_item, null, false, component);
  }

  public static RecipeItemBinding bind(@NonNull View view) {
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
  public static RecipeItemBinding bind(@NonNull View view, @Nullable Object component) {
    return (RecipeItemBinding)bind(component, view, R.layout.recipe_item);
  }
}