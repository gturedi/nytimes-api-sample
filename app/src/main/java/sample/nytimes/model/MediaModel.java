package sample.nytimes.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by gturedi on 15.02.2019.
 */
public class MediaModel
        implements Serializable {

    @SerializedName("media-metadata")
    public List<MetaDataModel> metaData;

}