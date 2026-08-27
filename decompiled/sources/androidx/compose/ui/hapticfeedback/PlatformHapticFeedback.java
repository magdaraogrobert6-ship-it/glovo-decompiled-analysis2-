package androidx.compose.ui.hapticfeedback;

import android.view.View;
import java.util.WeakHashMap;
import o.FocusPropertiesNode;
import o.setCustomContentCardsViewBindingHandler;

/* JADX INFO: loaded from: classes.dex */
public final class PlatformHapticFeedback implements HapticFeedback {
    public static final int $stable = 8;
    private final View view;

    @Override // androidx.compose.ui.hapticfeedback.HapticFeedback
    /* JADX INFO: renamed from: performHapticFeedback-CdsT49E */
    public void mo1501performHapticFeedbackCdsT49E(int i) {
        int i2;
        HapticFeedbackType.Companion companion = HapticFeedbackType.Companion;
        if (HapticFeedbackType.m1505equalsimpl0(i, companion.m1509getConfirm5zf0vsI())) {
            i2 = 16;
        } else if (HapticFeedbackType.m1505equalsimpl0(i, companion.m1510getContextClick5zf0vsI())) {
            i2 = 6;
        } else if (HapticFeedbackType.m1505equalsimpl0(i, companion.m1511getGestureEnd5zf0vsI())) {
            i2 = 13;
        } else if (HapticFeedbackType.m1505equalsimpl0(i, companion.m1512getGestureThresholdActivate5zf0vsI())) {
            i2 = 23;
        } else if (HapticFeedbackType.m1505equalsimpl0(i, companion.m1513getKeyboardTap5zf0vsI())) {
            i2 = 3;
        } else if (HapticFeedbackType.m1505equalsimpl0(i, companion.m1514getLongPress5zf0vsI())) {
            i2 = 0;
        } else if (HapticFeedbackType.m1505equalsimpl0(i, companion.m1515getReject5zf0vsI())) {
            i2 = 17;
        } else if (HapticFeedbackType.m1505equalsimpl0(i, companion.m1516getSegmentFrequentTick5zf0vsI())) {
            i2 = 27;
        } else if (HapticFeedbackType.m1505equalsimpl0(i, companion.m1517getSegmentTick5zf0vsI())) {
            i2 = 26;
        } else if (HapticFeedbackType.m1505equalsimpl0(i, companion.m1518getTextHandleMove5zf0vsI())) {
            i2 = 9;
        } else if (HapticFeedbackType.m1505equalsimpl0(i, companion.m1519getToggleOff5zf0vsI())) {
            i2 = 22;
        } else if (HapticFeedbackType.m1505equalsimpl0(i, companion.m1520getToggleOn5zf0vsI())) {
            i2 = 21;
        } else {
            i2 = HapticFeedbackType.m1505equalsimpl0(i, companion.m1521getVirtualKey5zf0vsI()) ? 1 : -1;
        }
        View view = this.view;
        WeakHashMap weakHashMap = FocusPropertiesNode.RatingCompat;
        int iIconCompatParcelizer = setCustomContentCardsViewBindingHandler.IconCompatParcelizer(i2);
        if (iIconCompatParcelizer == -1) {
            return;
        }
        view.performHapticFeedback(iIconCompatParcelizer);
    }

    public PlatformHapticFeedback(View view) {
        this.view = view;
    }
}
