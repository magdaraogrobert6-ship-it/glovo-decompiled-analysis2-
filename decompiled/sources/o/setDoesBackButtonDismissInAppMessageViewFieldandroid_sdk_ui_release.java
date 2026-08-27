package o;

import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import kotlinx.datetime.LocalDateTime$Companion;
import kotlinx.datetime.serializers.LocalDateTimeIso8601Serializer;
import kotlinx.serialization.Serializable;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
@Serializable(write = LocalDateTimeIso8601Serializer.class)
public final class setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release implements Comparable<setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release> {
    public static final LocalDateTime$Companion Companion = new Object() { // from class: kotlinx.datetime.LocalDateTime$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return LocalDateTimeIso8601Serializer.write;
        }
    };
    public final LocalDateTime value;

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlinx.datetime.LocalDateTime$Companion] */
    static {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        localDateTime.getClass();
        new setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release(localDateTime);
        LocalDateTime localDateTime2 = LocalDateTime.MAX;
        localDateTime2.getClass();
        new setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release(localDateTime2);
    }

    @Override // java.lang.Comparable
    public final int compareTo(setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release) {
        setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release2 = setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release;
        setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release2.getClass();
        return this.value.compareTo((ChronoLocalDateTime<?>) setdoesbackbuttondismissinappmessageviewfieldandroid_sdk_ui_release2.value);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release)) {
            return false;
        }
        return ((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{this.value, ((setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release) obj).value}, getCieXyz.write())).booleanValue();
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        String string = this.value.toString();
        string.getClass();
        return string;
    }

    public setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release(int i, int i2, int i3, int i4, int i5) {
        try {
            LocalDateTime localDateTimeOf = LocalDateTime.of(i, i2, i3, i4, i5, 0, 0);
            localDateTimeOf.getClass();
            this.value = localDateTimeOf;
        } catch (DateTimeException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public setDoesBackButtonDismissInAppMessageViewFieldandroid_sdk_ui_release(LocalDateTime localDateTime) {
        localDateTime.getClass();
        this.value = localDateTime;
    }
}
