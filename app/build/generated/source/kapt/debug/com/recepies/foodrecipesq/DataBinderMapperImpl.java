package com.recepies.foodrecipesq;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.recepies.foodrecipesq.databinding.ActivityMainBindingImpl;
import com.recepies.foodrecipesq.databinding.ActivityRecipeDetailBindingImpl;
import com.recepies.foodrecipesq.databinding.FragmentFavoriteRecipeBindingImpl;
import com.recepies.foodrecipesq.databinding.FragmentFoodRecipeBindingImpl;
import com.recepies.foodrecipesq.databinding.FragmentJokeRecipeBindingImpl;
import com.recepies.foodrecipesq.databinding.LoaderViewLayoutBindingImpl;
import com.recepies.foodrecipesq.databinding.NoResultUiBindingImpl;
import com.recepies.foodrecipesq.databinding.RecipeFilterLayoutBindingImpl;
import com.recepies.foodrecipesq.databinding.RecipeIngredientLayoutBindingImpl;
import com.recepies.foodrecipesq.databinding.RecipeInstructionItemBindingImpl;
import com.recepies.foodrecipesq.databinding.RecipeInstructionLayoutBindingImpl;
import com.recepies.foodrecipesq.databinding.RecipeItemBindingImpl;
import com.recepies.foodrecipesq.databinding.RecipeOverviewContentItemBindingImpl;
import com.recepies.foodrecipesq.databinding.RecipeOverviewFragmentBindingImpl;
import com.recepies.foodrecipesq.databinding.UserPrefItemLayoutBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYRECIPEDETAIL = 2;

  private static final int LAYOUT_FRAGMENTFAVORITERECIPE = 3;

  private static final int LAYOUT_FRAGMENTFOODRECIPE = 4;

  private static final int LAYOUT_FRAGMENTJOKERECIPE = 5;

  private static final int LAYOUT_LOADERVIEWLAYOUT = 6;

  private static final int LAYOUT_NORESULTUI = 7;

  private static final int LAYOUT_RECIPEFILTERLAYOUT = 8;

  private static final int LAYOUT_RECIPEINGREDIENTLAYOUT = 9;

  private static final int LAYOUT_RECIPEINSTRUCTIONITEM = 10;

  private static final int LAYOUT_RECIPEINSTRUCTIONLAYOUT = 11;

  private static final int LAYOUT_RECIPEITEM = 12;

  private static final int LAYOUT_RECIPEOVERVIEWCONTENTITEM = 13;

  private static final int LAYOUT_RECIPEOVERVIEWFRAGMENT = 14;

  private static final int LAYOUT_USERPREFITEMLAYOUT = 15;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(15);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.recepies.foodrecipesq.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.recepies.foodrecipesq.R.layout.activity_recipe_detail, LAYOUT_ACTIVITYRECIPEDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.recepies.foodrecipesq.R.layout.fragment_favorite_recipe, LAYOUT_FRAGMENTFAVORITERECIPE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.recepies.foodrecipesq.R.layout.fragment_food_recipe, LAYOUT_FRAGMENTFOODRECIPE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.recepies.foodrecipesq.R.layout.fragment_joke_recipe, LAYOUT_FRAGMENTJOKERECIPE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.recepies.foodrecipesq.R.layout.loader_view_layout, LAYOUT_LOADERVIEWLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.recepies.foodrecipesq.R.layout.no_result_ui, LAYOUT_NORESULTUI);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.recepies.foodrecipesq.R.layout.recipe_filter_layout, LAYOUT_RECIPEFILTERLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.recepies.foodrecipesq.R.layout.recipe_ingredient_layout, LAYOUT_RECIPEINGREDIENTLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.recepies.foodrecipesq.R.layout.recipe_instruction_item, LAYOUT_RECIPEINSTRUCTIONITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.recepies.foodrecipesq.R.layout.recipe_instruction_layout, LAYOUT_RECIPEINSTRUCTIONLAYOUT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.recepies.foodrecipesq.R.layout.recipe_item, LAYOUT_RECIPEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.recepies.foodrecipesq.R.layout.recipe_overview_content_item, LAYOUT_RECIPEOVERVIEWCONTENTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.recepies.foodrecipesq.R.layout.recipe_overview_fragment, LAYOUT_RECIPEOVERVIEWFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.recepies.foodrecipesq.R.layout.user_pref_item_layout, LAYOUT_USERPREFITEMLAYOUT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYRECIPEDETAIL: {
          if ("layout/activity_recipe_detail_0".equals(tag)) {
            return new ActivityRecipeDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_recipe_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFAVORITERECIPE: {
          if ("layout/fragment_favorite_recipe_0".equals(tag)) {
            return new FragmentFavoriteRecipeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_favorite_recipe is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFOODRECIPE: {
          if ("layout/fragment_food_recipe_0".equals(tag)) {
            return new FragmentFoodRecipeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_food_recipe is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTJOKERECIPE: {
          if ("layout/fragment_joke_recipe_0".equals(tag)) {
            return new FragmentJokeRecipeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_joke_recipe is invalid. Received: " + tag);
        }
        case  LAYOUT_LOADERVIEWLAYOUT: {
          if ("layout/loader_view_layout_0".equals(tag)) {
            return new LoaderViewLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for loader_view_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_NORESULTUI: {
          if ("layout/no_result_ui_0".equals(tag)) {
            return new NoResultUiBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for no_result_ui is invalid. Received: " + tag);
        }
        case  LAYOUT_RECIPEFILTERLAYOUT: {
          if ("layout/recipe_filter_layout_0".equals(tag)) {
            return new RecipeFilterLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recipe_filter_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_RECIPEINGREDIENTLAYOUT: {
          if ("layout/recipe_ingredient_layout_0".equals(tag)) {
            return new RecipeIngredientLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recipe_ingredient_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_RECIPEINSTRUCTIONITEM: {
          if ("layout/recipe_instruction_item_0".equals(tag)) {
            return new RecipeInstructionItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recipe_instruction_item is invalid. Received: " + tag);
        }
        case  LAYOUT_RECIPEINSTRUCTIONLAYOUT: {
          if ("layout/recipe_instruction_layout_0".equals(tag)) {
            return new RecipeInstructionLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recipe_instruction_layout is invalid. Received: " + tag);
        }
        case  LAYOUT_RECIPEITEM: {
          if ("layout/recipe_item_0".equals(tag)) {
            return new RecipeItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recipe_item is invalid. Received: " + tag);
        }
        case  LAYOUT_RECIPEOVERVIEWCONTENTITEM: {
          if ("layout/recipe_overview_content_item_0".equals(tag)) {
            return new RecipeOverviewContentItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recipe_overview_content_item is invalid. Received: " + tag);
        }
        case  LAYOUT_RECIPEOVERVIEWFRAGMENT: {
          if ("layout/recipe_overview_fragment_0".equals(tag)) {
            return new RecipeOverviewFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recipe_overview_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_USERPREFITEMLAYOUT: {
          if ("layout/user_pref_item_layout_0".equals(tag)) {
            return new UserPrefItemLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for user_pref_item_layout is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(15);

    static {
      sKeys.put("layout/activity_main_0", com.recepies.foodrecipesq.R.layout.activity_main);
      sKeys.put("layout/activity_recipe_detail_0", com.recepies.foodrecipesq.R.layout.activity_recipe_detail);
      sKeys.put("layout/fragment_favorite_recipe_0", com.recepies.foodrecipesq.R.layout.fragment_favorite_recipe);
      sKeys.put("layout/fragment_food_recipe_0", com.recepies.foodrecipesq.R.layout.fragment_food_recipe);
      sKeys.put("layout/fragment_joke_recipe_0", com.recepies.foodrecipesq.R.layout.fragment_joke_recipe);
      sKeys.put("layout/loader_view_layout_0", com.recepies.foodrecipesq.R.layout.loader_view_layout);
      sKeys.put("layout/no_result_ui_0", com.recepies.foodrecipesq.R.layout.no_result_ui);
      sKeys.put("layout/recipe_filter_layout_0", com.recepies.foodrecipesq.R.layout.recipe_filter_layout);
      sKeys.put("layout/recipe_ingredient_layout_0", com.recepies.foodrecipesq.R.layout.recipe_ingredient_layout);
      sKeys.put("layout/recipe_instruction_item_0", com.recepies.foodrecipesq.R.layout.recipe_instruction_item);
      sKeys.put("layout/recipe_instruction_layout_0", com.recepies.foodrecipesq.R.layout.recipe_instruction_layout);
      sKeys.put("layout/recipe_item_0", com.recepies.foodrecipesq.R.layout.recipe_item);
      sKeys.put("layout/recipe_overview_content_item_0", com.recepies.foodrecipesq.R.layout.recipe_overview_content_item);
      sKeys.put("layout/recipe_overview_fragment_0", com.recepies.foodrecipesq.R.layout.recipe_overview_fragment);
      sKeys.put("layout/user_pref_item_layout_0", com.recepies.foodrecipesq.R.layout.user_pref_item_layout);
    }
  }
}
