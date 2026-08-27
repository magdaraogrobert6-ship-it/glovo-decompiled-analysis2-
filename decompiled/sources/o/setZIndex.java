package o;

import com.roadrunner.customerchat.selfservice.presentation.screen.HelpCenterLoadingScreenKt;
import com.roadrunner.designsystem.compose.theme.tokens.Dimensions;
import com.roadrunner.vendor.review.data.database.entity.ReviewState;
import java.util.Calendar;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class setZIndex implements r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM {
    private static int IconCompatParcelizer = 0;
    private static int read = 1;
    public final /* synthetic */ int RemoteActionCompatParcelizer;
    public final /* synthetic */ Object serializer;
    public final /* synthetic */ long write;

    public /* synthetic */ setZIndex(placeSpaceBetweenfoundation_layout placespacebetweenfoundation_layout, long j) {
        this.RemoteActionCompatParcelizer = 1;
        this.serializer = placespacebetweenfoundation_layout;
        this.write = j;
    }

    public /* synthetic */ setZIndex(long j, int i, Object obj) {
        this.RemoteActionCompatParcelizer = i;
        this.write = j;
        this.serializer = obj;
    }

    @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
    public final Object invoke(Object obj) throws Exception {
        areCachedContentCardsStale arecachedcontentcardsstale;
        int i = 2 % 2;
        int i2 = read + 27;
        IconCompatParcelizer = i2 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
        int i3 = i2 % 2;
        int i4 = this.RemoteActionCompatParcelizer;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj2 = this.serializer;
        if (i4 == 0) {
            androidx.compose.ui.graphics.drawscope.DrawScope.m1298drawRectnJ9OG0$default((androidx.compose.ui.graphics.drawscope.DrawScope) obj, this.write, 0L, 0L, RangesKt.write(((Number) ((onViewAttachedToWindow) obj2).getValue()).floatValue(), 0.0f, 1.0f), null, null, 0, 118, null);
            return createfromparcel;
        }
        if (i4 != 1) {
            long j = this.write;
            deserializeContentCard deserializecontentcard = (deserializeContentCard) obj2;
            tintxETnrds tintxetnrds = (tintxETnrds) obj;
            tintxetnrds.getClass();
            UncheckedColordefault uncheckedColordefaultRemoteActionCompatParcelizer = tintxetnrds.RemoteActionCompatParcelizer("SELECT * FROM vendor_review_state WHERE delivery_id = ?");
            try {
                uncheckedColordefaultRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(1, j);
                int iWrite = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "delivery_id");
                int iWrite2 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "state");
                int iWrite3 = coil3.util.UtilsKt.write(uncheckedColordefaultRemoteActionCompatParcelizer, "updated_at");
                if (uncheckedColordefaultRemoteActionCompatParcelizer.IconCompatParcelizer()) {
                    long jSerializer = uncheckedColordefaultRemoteActionCompatParcelizer.serializer(iWrite);
                    String str = uncheckedColordefaultRemoteActionCompatParcelizer.read(iWrite2);
                    stopInstancelambda11 stopinstancelambda11 = deserializecontentcard.RemoteActionCompatParcelizer;
                    str.getClass();
                    ReviewState reviewStateValueOf = ReviewState.valueOf(str);
                    long jSerializer2 = uncheckedColordefaultRemoteActionCompatParcelizer.serializer(iWrite3);
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(jSerializer2);
                    arecachedcontentcardsstale = new areCachedContentCardsStale(jSerializer, reviewStateValueOf, calendar);
                } else {
                    arecachedcontentcardsstale = null;
                }
                return arecachedcontentcardsstale;
            } finally {
                uncheckedColordefaultRemoteActionCompatParcelizer.close();
            }
        }
        onViewAttachedToWindow onviewattachedtowindow = (onViewAttachedToWindow) obj2;
        androidx.compose.ui.graphics.drawscope.DrawScope drawScope = (androidx.compose.ui.graphics.drawscope.DrawScope) obj;
        drawScope.getClass();
        float fMo48toPx0680j_4 = drawScope.mo48toPx0680j_4(Dimensions.getActionBarHideOffset);
        float fMo48toPx0680j_5 = drawScope.mo48toPx0680j_4(Dimensions.setMenu);
        int iFloor = ((int) Math.floor(((Number) onviewattachedtowindow.getValue()).floatValue())) % 4;
        float fFloatValue = ((Number) onviewattachedtowindow.getValue()).floatValue();
        float fFloor = (float) Math.floor(((Number) onviewattachedtowindow.getValue()).floatValue());
        float fIntBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo1304getSizeNHjbRc() & 4294967295L)) / 2.0f;
        int i5 = 0;
        float f = fMo48toPx0680j_4;
        while (i5 < 3) {
            float[][] fArr = HelpCenterLoadingScreenKt.read;
            float f2 = fArr[iFloor][i5];
            androidx.compose.ui.graphics.drawscope.DrawScope.m1285drawCircleVaOC9Bg$default(drawScope, this.write, (((fArr[(iFloor + 1) % 4][i5] - f2) * (fFloatValue - fFloor)) + f2) * fMo48toPx0680j_4, androidx.compose.ui.geometry.Offset.m469constructorimpl((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L)), 0.0f, null, null, 0, 120, null);
            f += fMo48toPx0680j_5;
            i5++;
            int i6 = read + 119;
            IconCompatParcelizer = i6 % androidx.compose.ui.graphics.Fields.SpotShadowColor;
            if (i6 % 2 != 0) {
                int i7 = 4 % 2;
            }
        }
        return createfromparcel;
    }
}
