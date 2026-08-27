package o;

/* JADX INFO: loaded from: classes.dex */
public final class TextFieldImplKtCommonDecorationBox3containerWithId1 {
    public final int read;
    public final int serializer;
    public final PullToRefreshBox write;

    public TextFieldImplKtCommonDecorationBox3containerWithId1(int i, int i2, PullToRefreshBox pullToRefreshBox) {
        this.serializer = i;
        this.read = i2;
        this.write = pullToRefreshBox;
        if (i < 0) {
            TriStateCheckbox.read("startIndex should be >= 0");
        }
        if (i2 > 0) {
            return;
        }
        TriStateCheckbox.read("size should be > 0");
    }
}
