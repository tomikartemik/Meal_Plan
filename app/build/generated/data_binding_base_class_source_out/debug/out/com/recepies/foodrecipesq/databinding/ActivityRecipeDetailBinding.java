// Generated by data binding compiler. Do not edit!
package com.recepies.foodrecipesq.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.recepies.foodrecipesq.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityRecipeDetailBinding extends ViewDataBinding {
  @NonNull
  public final TabLayout tablayout;

  @NonNull
  public final ViewPager2 viewPager;

  protected ActivityRecipeDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      TabLayout tablayout, ViewPager2 viewPager) {
    super(_bindingComponent, _root, _localFieldCount);
    this.tablayout = tablayout;
    this.viewPager = viewPager;
  }

  @NonNull
  public static ActivityRecipeDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_recipe_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRecipeDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityRecipeDetailBinding>inflateInternal(inflater, R.layout.activity_recipe_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityRecipeDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_recipe_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityRecipeDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityRecipeDetailBinding>inflateInternal(inflater, R.layout.activity_recipe_detail, null, false, component);
  }

  public static ActivityRecipeDetailBinding bind(@NonNull View view) {
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
  public static ActivityRecipeDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityRecipeDetailBinding)bind(component, view, R.layout.activity_recipe_detail);
  }
}