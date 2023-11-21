package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new com.recepies.foodrecipesq.DataBinderMapperImpl());
  }
}
