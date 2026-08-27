package androidx.compose.ui.tooling.preview.datasource;

import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import androidx.room.RoomDatabase$$ExternalSyntheticLambda4;
import bo.app.d$$ExternalSyntheticOutline0;
import com.braze.ui.support.ViewUtils$$ExternalSyntheticLambda1;
import com.huawei.riemann.location.common.utils.Constant;
import java.util.List;
import o.DrawableTransformation;
import o.createBrazeUserChangeEventSubscriberlambda01;
import o.onContentCardClicked;
import o.requestDisplayInAppMessagelambda10;
import o.requestDisplayInAppMessagelambda4;
import o.requestDisplayInAppMessagelambda6;
import o.requestDisplayInAppMessagelambda8;
import o.resetAfterInAppMessageCloselambda1;
import o.resetAfterInAppMessageCloselambda2;
import o.resumeWebviewIfNecessarylambda0;

/* JADX INFO: loaded from: classes.dex */
public class LoremIpsum implements PreviewParameterProvider<String> {
    public static final int $stable = 0;
    private final int words;

    private final String generateLoremIpsum(int i) {
        resumeWebviewIfNecessarylambda0 resumewebviewifnecessarylambda0Serializer;
        ViewUtils$$ExternalSyntheticLambda1 viewUtils$$ExternalSyntheticLambda1 = new ViewUtils$$ExternalSyntheticLambda1(new createBrazeUserChangeEventSubscriberlambda01(), LoremIpsumKt.LOREM_IPSUM_SOURCE.size(), 3);
        resumeWebviewIfNecessarylambda0 requestdisplayinappmessagelambda4 = new requestDisplayInAppMessagelambda4(new resetAfterInAppMessageCloselambda1(new RoomDatabase$$ExternalSyntheticLambda4(3, viewUtils$$ExternalSyntheticLambda1), viewUtils$$ExternalSyntheticLambda1));
        if (i < 0) {
            DrawableTransformation.serializer((Object) d$$ExternalSyntheticOutline0.m(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            resumewebviewifnecessarylambda0Serializer = requestDisplayInAppMessagelambda8.IconCompatParcelizer;
        } else {
            resumewebviewifnecessarylambda0Serializer = requestdisplayinappmessagelambda4 instanceof requestDisplayInAppMessagelambda6 ? ((requestDisplayInAppMessagelambda6) requestdisplayinappmessagelambda4).serializer(i) : new requestDisplayInAppMessagelambda10(requestdisplayinappmessagelambda4, i, 1);
        }
        return resetAfterInAppMessageCloselambda2.RemoteActionCompatParcelizer(resumewebviewifnecessarylambda0Serializer, " ");
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public resumeWebviewIfNecessarylambda0 getValues() {
        return onContentCardClicked.IconCompatParcelizer((Object[]) new String[]{generateLoremIpsum(this.words)});
    }

    public LoremIpsum(int i) {
        this.words = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String generateLoremIpsum$lambda$0(createBrazeUserChangeEventSubscriberlambda01 createbrazeuserchangeeventsubscriberlambda01, int i) {
        List list = LoremIpsumKt.LOREM_IPSUM_SOURCE;
        int i2 = createbrazeuserchangeeventsubscriberlambda01.read;
        createbrazeuserchangeeventsubscriberlambda01.read = i2 + 1;
        return (String) list.get(i2 % i);
    }

    public LoremIpsum() {
        this(Constant.ERROR_UNKNOWN);
    }
}
