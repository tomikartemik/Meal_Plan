package com.recepies.foodrecipesq.databinding;
import com.recepies.foodrecipesq.R;
import com.recepies.foodrecipesq.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class RecipeItemBindingImpl extends RecipeItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(9);
        sIncludes.setIncludes(1, 
            new String[] {"user_pref_item_layout", "user_pref_item_layout", "user_pref_item_layout"},
            new int[] {2, 3, 4},
            new int[] {com.recepies.foodrecipesq.R.layout.user_pref_item_layout,
                com.recepies.foodrecipesq.R.layout.user_pref_item_layout,
                com.recepies.foodrecipesq.R.layout.user_pref_item_layout});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.recipe_image, 5);
        sViewsWithIds.put(R.id.vertical_barrier, 6);
        sViewsWithIds.put(R.id.recipe_title, 7);
        sViewsWithIds.put(R.id.recipe_desc, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public RecipeItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private RecipeItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (androidx.cardview.widget.CardView) bindings[0]
            , (com.recepies.foodrecipesq.databinding.UserPrefItemLayoutBinding) bindings[2]
            , (android.widget.TextView) bindings[8]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (com.recepies.foodrecipesq.databinding.UserPrefItemLayoutBinding) bindings[3]
            , (com.recepies.foodrecipesq.databinding.UserPrefItemLayoutBinding) bindings[4]
            , (android.view.View) bindings[6]
            );
        this.cardView.setTag(null);
        setContainedBinding(this.likeView);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        setContainedBinding(this.timeView);
        setContainedBinding(this.vegView);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        likeView.invalidateAll();
        timeView.invalidateAll();
        vegView.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (likeView.hasPendingBindings()) {
            return true;
        }
        if (timeView.hasPendingBindings()) {
            return true;
        }
        if (vegView.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        likeView.setLifecycleOwner(lifecycleOwner);
        timeView.setLifecycleOwner(lifecycleOwner);
        vegView.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeLikeView((com.recepies.foodrecipesq.databinding.UserPrefItemLayoutBinding) object, fieldId);
            case 1 :
                return onChangeTimeView((com.recepies.foodrecipesq.databinding.UserPrefItemLayoutBinding) object, fieldId);
            case 2 :
                return onChangeVegView((com.recepies.foodrecipesq.databinding.UserPrefItemLayoutBinding) object, fieldId);
        }
        return false;
    }
    private boolean onChangeLikeView(com.recepies.foodrecipesq.databinding.UserPrefItemLayoutBinding LikeView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeTimeView(com.recepies.foodrecipesq.databinding.UserPrefItemLayoutBinding TimeView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVegView(com.recepies.foodrecipesq.databinding.UserPrefItemLayoutBinding VegView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
        executeBindingsOn(likeView);
        executeBindingsOn(timeView);
        executeBindingsOn(vegView);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): likeView
        flag 1 (0x2L): timeView
        flag 2 (0x3L): vegView
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}