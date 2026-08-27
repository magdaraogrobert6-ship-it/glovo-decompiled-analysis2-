package o;

import kotlinx.datetime.DateTimeUnit$DateBased$Companion;
import kotlinx.serialization.Serializable;
import o.InAppMessageOperation;
import o.setGraphicModalMaxWidthDp;

/* JADX INFO: loaded from: classes4.dex */
@Serializable(write = InAppMessageOperation.class)
public abstract class setCustomInAppMessageManagerListener extends setCustomHtmlInAppMessageActionListener {
    public static final DateTimeUnit$DateBased$Companion Companion = new Object() { // from class: kotlinx.datetime.DateTimeUnit$DateBased$Companion
        public final setGraphicModalMaxWidthDp serializer() {
            return InAppMessageOperation.serializer;
        }
    };
}
