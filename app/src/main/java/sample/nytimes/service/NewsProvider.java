package sample.nytimes.service;

import retrofit2.Call;
import retrofit2.http.GET;
import sample.nytimes.model.NewsResponseModel;

/**
 * Created by gturedi on 15.02.2019.
 */
public interface NewsProvider {

    @GET("/svc/mostpopular/v2/mostviewed/all-sections/"+ NewsService.PERIOD +".json?api-key=" + NewsService.API_KEY)
    Call<NewsResponseModel> mostPopular();

}