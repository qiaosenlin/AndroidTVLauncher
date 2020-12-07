package com.jacky.launcher.detail;



import android.support.v17.leanback.widget.AbstractDetailsDescriptionPresenter;

public class MediaDetailsDescriptionPresenter extends AbstractDetailsDescriptionPresenter {

    @Override
    protected void onBindDescription(ViewHolder viewHolder, Object itemData) {

        if(itemData instanceof MediaModel){
            MediaModel mediaModel = (MediaModel) itemData;
            viewHolder.getSubtitle().setText(mediaModel.getTitle());
            viewHolder.getBody().setText(mediaModel.getContent());
        }
    }
}