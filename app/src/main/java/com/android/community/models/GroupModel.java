package com.android.community.models;

import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.support.v7.widget.CardView;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.airbnb.epoxy.EpoxyAttribute;
import com.airbnb.epoxy.EpoxyModelClass;
import com.airbnb.epoxy.EpoxyModelWithHolder;
import com.android.community.R;
import com.airbnb.epoxy.SimpleEpoxyModel;
import com.android.community.models.GroupModel.GroupHolder;

import butterknife.BindView;

/**
 * This is an example of using {@link com.airbnb.epoxy.SimpleEpoxyModel}, which is useful if you
 * don't need to do anything special in onBind. You can also instantiate {@link
 * com.airbnb.epoxy.SimpleEpoxyModel} directly instead of subclassing it if you don't need to do
 * anything in onBind.
 */

@EpoxyModelClass(layout = R.layout.model_group)
public abstract class GroupModel extends EpoxyModelWithHolder<GroupHolder> {
	@EpoxyAttribute @ColorInt int color;
	@EpoxyAttribute @StringRes int text;
	@EpoxyAttribute @DrawableRes int image;

	@Override
	public void bind(GroupHolder holder) {
		holder.cardView.setCardBackgroundColor(color);
		holder.cardView.setBackgroundResource(image);
		holder.textView.setText(text);
	}

	static class GroupHolder extends BaseEpoxyHolder {
		@BindView(R.id.card_view_group) CardView cardView;
		@BindView(R.id.text_view_group) TextView textView;
	}
}
