package sample.nytimes.misc;

/**
 * Created by gturedi on 29/12/16.
 */
public interface RowClickListener<T> {

    void onRowClick(int row, T item);

}