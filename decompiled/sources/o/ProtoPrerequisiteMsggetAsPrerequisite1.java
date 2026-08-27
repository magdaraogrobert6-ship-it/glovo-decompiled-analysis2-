package o;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import timber.log.Timber;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ProtoPrerequisiteMsggetAsPrerequisite1 extends ProtoPrerequisiteMsgserializer {
    private static int IconCompatParcelizer = 0;
    private static int MediaSessionCompatQueueItem = 1;
    private static int RemoteActionCompatParcelizer = 1;
    private static int serializer;
    public static final Pattern write = Pattern.compile("(\\$\\d+)+$");
    public final List read = androidx.sqlite.SQLite.read(Timber.class.getName(), Timber.Forest.class.getName(), ProtoPrerequisiteMsgserializer.class.getName(), ProtoPrerequisiteMsggetAsPrerequisite1.class.getName());

    static {
        int i = serializer + 43;
        RemoteActionCompatParcelizer = i % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i2 = i % 2;
    }

    @Override // o.ProtoPrerequisiteMsgserializer
    public final String IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        MediaSessionCompatQueueItem = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        if (i2 % 2 == 0) {
            super.IconCompatParcelizer();
            throw null;
        }
        String strIconCompatParcelizer = super.IconCompatParcelizer();
        if (strIconCompatParcelizer != null) {
            return strIconCompatParcelizer;
        }
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        stackTrace.getClass();
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!this.read.contains(stackTraceElement.getClassName())) {
                String className = stackTraceElement.getClassName();
                className.getClass();
                String strIconCompatParcelizer2 = hideCurrentlyDisplayingInAppMessage.IconCompatParcelizer('.', className, className);
                Matcher matcher = write.matcher(strIconCompatParcelizer2);
                if (matcher.find()) {
                    strIconCompatParcelizer2 = matcher.replaceAll("");
                    strIconCompatParcelizer2.getClass();
                }
                return strIconCompatParcelizer2 + ":" + stackTraceElement.getLineNumber();
            }
        }
        DrawableTransformation.write("Array contains no element matching the predicate.");
        int i3 = IconCompatParcelizer + 69;
        MediaSessionCompatQueueItem = i3 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i4 = i3 % 2;
        return null;
    }
}
