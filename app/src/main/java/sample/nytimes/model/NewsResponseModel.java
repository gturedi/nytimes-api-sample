package sample.nytimes.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by gturedi on 15.02.2019.
 */
public class NewsResponseModel
        implements Serializable {

    public List<NewsModel> results;

}