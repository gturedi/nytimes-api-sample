package sample.nytimes.model;

import java.io.Serializable;
import java.util.List;

import sample.nytimes.misc.NYTimesUtils;

/**
 * Created by gturedi on 15.02.2019.
 */
public class NewsModel
        implements Serializable {

    public static final String STANDARD_THUMBNAIL = "Standard Thumbnail";

    public long id;
    public String url;
    public String title;
    public String byline;
    public String published_date;
    public List<MediaModel> media;

    public String getImageUrl() {
        if (NYTimesUtils.isNullOrEmpty(media)) return "";
        if (NYTimesUtils.isNullOrEmpty(media.get(0).metaData)) return "";
        for (MetaDataModel item : media.get(0).metaData) {
            if (item.format.equalsIgnoreCase(STANDARD_THUMBNAIL)) {
                return item.url;
            }
        }
        return "";
    }

}