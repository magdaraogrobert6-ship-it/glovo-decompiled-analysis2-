package o;

/* JADX INFO: loaded from: classes.dex */
public final class setOnMenuItemClickListener implements Runnable {
    public final /* synthetic */ setExpandedActionViewsExclusive IconCompatParcelizer;
    public final /* synthetic */ int read;

    public /* synthetic */ setOnMenuItemClickListener(setExpandedActionViewsExclusive setexpandedactionviewsexclusive, int i) {
        this.read = i;
        this.IconCompatParcelizer = setexpandedactionviewsexclusive;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.read;
        setExpandedActionViewsExclusive setexpandedactionviewsexclusive = this.IconCompatParcelizer;
        if (i == 0) {
            setHasNonEmbeddedTabs sethasnonembeddedtabs = setexpandedactionviewsexclusive.PlaybackStateCompat;
            if (sethasnonembeddedtabs != null) {
                sethasnonembeddedtabs.setListSelectionHidden(true);
                sethasnonembeddedtabs.requestLayout();
                return;
            }
            return;
        }
        setHasNonEmbeddedTabs sethasnonembeddedtabs2 = setexpandedactionviewsexclusive.PlaybackStateCompat;
        if (sethasnonembeddedtabs2 == null || !sethasnonembeddedtabs2.isAttachedToWindow() || setexpandedactionviewsexclusive.PlaybackStateCompat.getCount() <= setexpandedactionviewsexclusive.PlaybackStateCompat.getChildCount() || setexpandedactionviewsexclusive.PlaybackStateCompat.getChildCount() > setexpandedactionviewsexclusive.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss) {
            return;
        }
        setexpandedactionviewsexclusive.r8lambdawJ5MHcSJed_CjC7r4OWD0UxyJsQ.setInputMethodMode(2);
        setexpandedactionviewsexclusive.b_();
    }
}
