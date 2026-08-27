package o;

/* JADX INFO: loaded from: classes.dex */
public abstract class getBottomEndannotations {
    public static final void RemoteActionCompatParcelizer(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            TriStateCheckbox.read("both minLines " + i + " and maxLines " + i2 + " must be greater than zero");
        }
        if (i <= i2) {
            return;
        }
        TriStateCheckbox.read("minLines " + i + " must be less than or equal to maxLines " + i2);
    }
}
