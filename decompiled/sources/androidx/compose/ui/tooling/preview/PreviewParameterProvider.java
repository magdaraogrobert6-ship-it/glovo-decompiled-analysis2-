package androidx.compose.ui.tooling.preview;

import androidx.sqlite.SQLite;
import java.util.Iterator;
import o.resumeWebviewIfNecessarylambda0;

/* JADX INFO: loaded from: classes.dex */
public interface PreviewParameterProvider<T> {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static <T> int getCount(PreviewParameterProvider<T> previewParameterProvider) {
            return PreviewParameterProvider.super.getCount();
        }

        @Deprecated
        public static <T> String getDisplayName(PreviewParameterProvider<T> previewParameterProvider, int i) {
            return PreviewParameterProvider.super.getDisplayName(i);
        }
    }

    default String getDisplayName(int i) {
        return null;
    }

    resumeWebviewIfNecessarylambda0 getValues();

    default int getCount() {
        resumeWebviewIfNecessarylambda0 values = getValues();
        values.getClass();
        Iterator it = values.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                SQLite.RemoteActionCompatParcelizer();
                throw null;
            }
        }
        return i;
    }
}
