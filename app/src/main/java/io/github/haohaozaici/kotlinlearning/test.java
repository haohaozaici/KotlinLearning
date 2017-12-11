package io.github.haohaozaici.kotlinlearning;

import io.github.haohaozaici.kotlinlearning.adapter.ForecastText;
import io.github.haohaozaici.kotlinlearning.adapter.ForecastTextViewBinder;
import me.drakeet.multitype.Items;
import me.drakeet.multitype.MultiTypeAdapter;

/**
 * Created by haohao on 2017/12/7.
 */

public class test {

  {

    Items items = new Items();
    items.add(new ForecastText("Mon 6/23 - Sunny - 31/17"));
    items.add(new ForecastText("Tue 6/24 - Foggy - 21/8"));
    items.add(new ForecastText("Wed 6/25 - Cloudy - 22/17"));
    items.add(new ForecastText("Thurs 6/26 - Rainy - 18/11"));

    MultiTypeAdapter adapter = new MultiTypeAdapter();
    adapter.register(ForecastText.class,new ForecastTextViewBinder());

  }


}
