package o;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0 extends ActionMode {
    public final handleOnBackPressed IconCompatParcelizer;
    public final Context read;

    @Override // android.view.ActionMode
    public final void finish() {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.IconCompatParcelizer.serializer();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new onContentChanged(this.read, this.IconCompatParcelizer.read());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.IconCompatParcelizer.write();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.IconCompatParcelizer.IconCompatParcelizer();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.IconCompatParcelizer.RatingCompat;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.IconCompatParcelizer.RatingCompat();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.IconCompatParcelizer.MediaSessionCompatQueueItem;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.IconCompatParcelizer.MediaBrowserCompatMediaItem();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.IconCompatParcelizer.MediaDescriptionCompat();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.IconCompatParcelizer.read(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.IconCompatParcelizer.RatingCompat = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.IconCompatParcelizer.serializer(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.IconCompatParcelizer.read(z);
    }

    public OnBackPressedDispatcherOnBackPressedEventInputExternalSyntheticLambda0(Context context, handleOnBackPressed handleonbackpressed) {
        this.read = context;
        this.IconCompatParcelizer = handleonbackpressed;
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.IconCompatParcelizer.serializer(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.IconCompatParcelizer.IconCompatParcelizer(i);
    }
}
