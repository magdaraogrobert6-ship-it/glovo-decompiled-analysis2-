package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;

/* JADX INFO: loaded from: classes.dex */
public final class IndicatorBox1CPYgEU extends androidx.compose.ui.Modifier.Node implements androidx.compose.ui.node.LayoutModifierNode, androidx.compose.ui.layout.BeyondBoundsLayoutProviderModifierNode, androidx.compose.ui.layout.BeyondBoundsLayout {
    public static final PullToRefreshDefaults RemoteActionCompatParcelizer = new PullToRefreshDefaults();
    public CommonDecorationBox IconCompatParcelizer;
    public SelectionHandleIcon read;
    public accessanimateToThreshold write;

    @Override // androidx.compose.ui.layout.BeyondBoundsLayoutProviderModifierNode
    public final androidx.compose.ui.layout.BeyondBoundsLayout getBeyondBoundsLayout() {
        return this;
    }

    public final boolean RemoteActionCompatParcelizer(int i) {
        androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.Companion companion = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.Companion;
        if (androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m2192equalsimpl0(i, companion.m2198getBeforehoxUOeE())) {
            return false;
        }
        if (androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m2192equalsimpl0(i, companion.m2197getAfterhoxUOeE())) {
            return true;
        }
        if (androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m2192equalsimpl0(i, companion.m2196getAbovehoxUOeE())) {
            return false;
        }
        if (androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m2192equalsimpl0(i, companion.m2199getBelowhoxUOeE())) {
            return true;
        }
        if (androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m2192equalsimpl0(i, companion.m2200getLefthoxUOeE())) {
            int i2 = TextFieldImplKtCommonDecorationBox3decoratedPrefix1.serializer[androidx.compose.ui.node.DelegatableNodeKt.requireLayoutDirection(this).ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    return true;
                }
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
            }
            return false;
        }
        if (!androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m2192equalsimpl0(i, companion.m2201getRighthoxUOeE())) {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("Lazy list does not support beyond bounds layout for the specified direction");
            return false;
        }
        int i3 = TextFieldImplKtCommonDecorationBox3decoratedPrefix1.serializer[androidx.compose.ui.node.DelegatableNodeKt.requireLayoutDirection(this).ordinal()];
        if (i3 == 1) {
            return true;
        }
        if (i3 == 2) {
            return false;
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
        return false;
    }

    @Override // androidx.compose.ui.layout.BeyondBoundsLayout
    /* JADX INFO: renamed from: layout-o7g1Pn8 */
    public final Object mo2188layouto7g1Pn8(int i, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        if (this.write.IconCompatParcelizer() <= 0 || !this.write.read() || !isAttached()) {
            return r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(RemoteActionCompatParcelizer);
        }
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i);
        accessanimateToThreshold accessanimatetothreshold = this.write;
        int iRemoteActionCompatParcelizer = zRemoteActionCompatParcelizer ? accessanimatetothreshold.RemoteActionCompatParcelizer() : accessanimatetothreshold.serializer();
        createInAppMessageEventSubscriber createinappmessageeventsubscriber = new createInAppMessageEventSubscriber();
        CommonDecorationBox commonDecorationBox = this.IconCompatParcelizer;
        commonDecorationBox.getClass();
        TextFieldImplKtCommonDecorationBox3decoratedSuffix1 textFieldImplKtCommonDecorationBox3decoratedSuffix1 = new TextFieldImplKtCommonDecorationBox3decoratedSuffix1(iRemoteActionCompatParcelizer, iRemoteActionCompatParcelizer);
        commonDecorationBox.read.IconCompatParcelizer(textFieldImplKtCommonDecorationBox3decoratedSuffix1);
        createinappmessageeventsubscriber.IconCompatParcelizer = textFieldImplKtCommonDecorationBox3decoratedSuffix1;
        int iWrite = this.write.write() * 2;
        int iIconCompatParcelizer = this.write.IconCompatParcelizer();
        if (iWrite > iIconCompatParcelizer) {
            iWrite = iIconCompatParcelizer;
        }
        Object objInvoke = null;
        int i2 = 0;
        while (objInvoke == null && write((TextFieldImplKtCommonDecorationBox3decoratedSuffix1) createinappmessageeventsubscriber.IconCompatParcelizer, i) && i2 < iWrite) {
            TextFieldImplKtCommonDecorationBox3decoratedSuffix1 textFieldImplKtCommonDecorationBox3decoratedSuffix2 = (TextFieldImplKtCommonDecorationBox3decoratedSuffix1) createinappmessageeventsubscriber.IconCompatParcelizer;
            int i3 = textFieldImplKtCommonDecorationBox3decoratedSuffix2.serializer;
            int i4 = textFieldImplKtCommonDecorationBox3decoratedSuffix2.read;
            if (RemoteActionCompatParcelizer(i)) {
                i4++;
            } else {
                i3--;
            }
            CommonDecorationBox commonDecorationBox2 = this.IconCompatParcelizer;
            commonDecorationBox2.getClass();
            TextFieldImplKtCommonDecorationBox3decoratedSuffix1 textFieldImplKtCommonDecorationBox3decoratedSuffix3 = new TextFieldImplKtCommonDecorationBox3decoratedSuffix1(i3, i4);
            commonDecorationBox2.read.IconCompatParcelizer(textFieldImplKtCommonDecorationBox3decoratedSuffix3);
            this.IconCompatParcelizer.read.RemoteActionCompatParcelizer((TextFieldImplKtCommonDecorationBox3decoratedSuffix1) createinappmessageeventsubscriber.IconCompatParcelizer);
            createinappmessageeventsubscriber.IconCompatParcelizer = textFieldImplKtCommonDecorationBox3decoratedSuffix3;
            i2++;
            androidx.compose.ui.node.LayoutModifierNodeKt.remeasureSync(this);
            objInvoke = r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(new PullToRefreshModifierNode(this, createinappmessageeventsubscriber, i));
        }
        this.IconCompatParcelizer.read.RemoteActionCompatParcelizer((TextFieldImplKtCommonDecorationBox3decoratedSuffix1) createinappmessageeventsubscriber.IconCompatParcelizer);
        androidx.compose.ui.node.LayoutModifierNodeKt.remeasureSync(this);
        return objInvoke;
    }

    public final boolean write(TextFieldImplKtCommonDecorationBox3decoratedSuffix1 textFieldImplKtCommonDecorationBox3decoratedSuffix1, int i) {
        androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.Companion companion = androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.Companion;
        if (!androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m2192equalsimpl0(i, companion.m2196getAbovehoxUOeE()) && !androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m2192equalsimpl0(i, companion.m2199getBelowhoxUOeE())) {
            if (androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m2192equalsimpl0(i, companion.m2200getLefthoxUOeE()) || androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m2192equalsimpl0(i, companion.m2201getRighthoxUOeE())) {
                if (this.read != SelectionHandleIcon.Vertical) {
                }
            } else if (!androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m2192equalsimpl0(i, companion.m2198getBeforehoxUOeE()) && !androidx.compose.ui.layout.BeyondBoundsLayout.LayoutDirection.m2192equalsimpl0(i, companion.m2197getAfterhoxUOeE())) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Lazy list does not support beyond bounds layout for the specified direction");
                return false;
            }
            if (RemoteActionCompatParcelizer(i)) {
            }
        } else if (this.read != SelectionHandleIcon.Horizontal) {
            if (RemoteActionCompatParcelizer(i) ? textFieldImplKtCommonDecorationBox3decoratedSuffix1.serializer > 0 : textFieldImplKtCommonDecorationBox3decoratedSuffix1.read < this.write.IconCompatParcelizer() - 1) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final androidx.compose.ui.layout.MeasureResult mo7measure3p2s80s(androidx.compose.ui.layout.MeasureScope measureScope, androidx.compose.ui.layout.Measurable measurable, long j) {
        androidx.compose.ui.layout.Placeable placeableMo2209measureBRTryo0 = measurable.mo2209measureBRTryo0(j);
        return androidx.compose.ui.layout.MeasureScope.layout$default(measureScope, placeableMo2209measureBRTryo0.getWidth(), placeableMo2209measureBRTryo0.getHeight(), null, new accessgetEvenOddcp(placeableMo2209measureBRTryo0, 3), 4, null);
    }
}
