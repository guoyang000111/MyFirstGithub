package sy.dao;

import sy.model.Countrylanguage;
import sy.model.CountrylanguageKey;

public interface CountrylanguageMapper {
    int deleteByPrimaryKey(CountrylanguageKey key);

    int insert(Countrylanguage record);

    int insertSelective(Countrylanguage record);

    Countrylanguage selectByPrimaryKey(CountrylanguageKey key);

    int updateByPrimaryKeySelective(Countrylanguage record);

    int updateByPrimaryKey(Countrylanguage record);
}