package androidx.constraintlayout.compose;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.emoji2.text.EmojiProcessor;
import bo.app.af$$ExternalSyntheticOutline0;
import bo.app.d$$ExternalSyntheticOutline0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import io.sentry.android.core.SentryLogcatAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.ranges.RangesKt;
import o.CacheDrawScoperecord11;
import o.DrawBackgroundModifier;
import o.DrawModifier;
import o.DrawModifierDefaultImpls;
import o.DrawWithContentElement;
import o.DrawWithContentModifier;
import o.PainterNode;
import o.RotateKt;
import o.ScrollStateExternalSyntheticLambda3;
import o.ThumbFetcher;
import o.accesstoSizeXkaWNTQjd;
import o.accesstoSpkPz2Gy4jd;
import o.calculateScaledSizeE7KxVPU;
import o.createFromParcel;
import o.drawBehind;
import o.getBlockui;
import o.getCieXyz;
import o.getContentScale;
import o.getOnDraw;
import o.getUseIntrinsicSize;
import o.hasSpecifiedAndFiniteHeightuvyYCjk;
import o.paintdefault;
import o.r8lambdaNGtmLVJzMfxJG0dVSGRl8fYF5wE;
import o.removeNodeAtDepth;
import o.rotate;
import o.scale;
import o.setAlignment;
import o.setPainter;
import o.setSizeToIntrinsics;
import o.toDpu2uoSUM;
import o.toPx0680j_4;
import o.toSpkPz2Gy4;

/* JADX INFO: loaded from: classes.dex */
public final class Measurer2 implements rotate, DrawModifierDefaultImpls {
    public final int[] IconCompatParcelizer;
    public final int[] MediaMetadataCompat;
    public final drawBehind MediaSessionCompatQueueItem;
    public final LinkedHashMap RemoteActionCompatParcelizer;
    public Map read;
    public final LinkedHashMap serializer;
    public final getUseIntrinsicSize write;

    @Override // o.rotate
    public final void read() {
    }

    public static void RemoteActionCompatParcelizer(hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk, int i, int i2, int i3, boolean z, boolean z2, int i4, int[] iArr) {
        int i5 = getBlockui.serializer[hasspecifiedandfiniteheightuvyycjk.ordinal()];
        if (i5 == 1) {
            iArr[0] = i;
            iArr[1] = i;
            return;
        }
        if (i5 == 2) {
            iArr[0] = 0;
            iArr[1] = i4;
            return;
        }
        if (i5 == 3) {
            boolean z3 = z2 || ((i3 == 1 || i3 == 2) && (i3 == 2 || i2 != 1 || z));
            iArr[0] = z3 ? i : 0;
            if (!z3) {
                i = i4;
            }
            iArr[1] = i;
            return;
        }
        if (i5 == 4) {
            iArr[0] = i4;
            iArr[1] = i4;
        } else {
            throw new IllegalStateException((hasspecifiedandfiniteheightuvyycjk + " is not supported").toString());
        }
    }

    public final long RemoteActionCompatParcelizer(setAlignment setalignment, long j) {
        int i;
        Object obj = setalignment._init_lambda3;
        String str = setalignment.onSaveInstanceState;
        int i2 = 0;
        if (!(setalignment instanceof scale)) {
            if (obj instanceof Measurable) {
                Placeable placeableMo2209measureBRTryo0 = ((Measurable) obj).mo2209measureBRTryo0(j);
                this.read.put(obj, placeableMo2209measureBRTryo0);
                return ScrollStateExternalSyntheticLambda3.write(placeableMo2209measureBRTryo0.getWidth(), placeableMo2209measureBRTryo0.getHeight());
            }
            SentryLogcatAdapter.IconCompatParcelizer("CCL", "Nothing to measure for widget: " + str);
            return ScrollStateExternalSyntheticLambda3.write(0, 0);
        }
        if (Constraints.m3624getHasFixedWidthimpl(j)) {
            i = 1073741824;
        } else {
            i = Constraints.m3622getHasBoundedWidthimpl(j) ? Integer.MIN_VALUE : 0;
        }
        if (Constraints.m3623getHasFixedHeightimpl(j)) {
            i2 = 1073741824;
        } else if (Constraints.m3621getHasBoundedHeightimpl(j)) {
            i2 = Integer.MIN_VALUE;
        }
        scale scaleVar = (scale) setalignment;
        scaleVar.RemoteActionCompatParcelizer(i, Constraints.m3626getMaxWidthimpl(j), i2, Constraints.m3625getMaxHeightimpl(j));
        return ScrollStateExternalSyntheticLambda3.write(scaleVar.removeOnPictureInPictureModeChangedListener, scaleVar.removeOnPictureInPictureUiStateChangedListener);
    }

    public final void performLayout(Placeable.PlacementScope placementScope, List list, Map map) {
        setAlignment setalignment;
        Placeable placeable;
        this.read = map;
        LinkedHashMap linkedHashMap = this.RemoteActionCompatParcelizer;
        boolean zIsEmpty = linkedHashMap.isEmpty();
        getUseIntrinsicSize getuseintrinsicsize = this.write;
        if (zIsEmpty) {
            ArrayList arrayList = getuseintrinsicsize.serializer;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                setAlignment setalignment2 = (setAlignment) arrayList.get(i);
                Object obj = setalignment2._init_lambda3;
                if (obj instanceof Measurable) {
                    toSpkPz2Gy4 tospkpz2gy4 = setalignment2.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                    setAlignment setalignment3 = tospkpz2gy4.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                    if (setalignment3 != null) {
                        tospkpz2gy4.RemoteActionCompatParcelizer = setalignment3.RatingCompat();
                        tospkpz2gy4.PlaybackStateCompatCustomAction = setalignment3.MediaSessionCompatToken();
                        tospkpz2gy4.MediaSessionCompatQueueItem = setalignment3.RatingCompat() + setalignment3.onPanelClosed;
                        tospkpz2gy4.serializer = setalignment3.MediaSessionCompatToken() + setalignment3.addObserverForBackInvoker;
                        tospkpz2gy4.RemoteActionCompatParcelizer(setalignment3.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss);
                    }
                    linkedHashMap.put(r8lambdaNGtmLVJzMfxJG0dVSGRl8fYF5wE.write((Measurable) obj), new toSpkPz2Gy4(tospkpz2gy4));
                }
            }
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Measurable measurable = (Measurable) list.get(i2);
            toSpkPz2Gy4 tospkpz2gy5 = (toSpkPz2Gy4) linkedHashMap.get(r8lambdaNGtmLVJzMfxJG0dVSGRl8fYF5wE.write(measurable));
            if (tospkpz2gy5 != null && (placeable = (Placeable) this.read.get(measurable)) != null) {
                long jM3812getZeronOccac = IntOffset.Companion.m3812getZeronOccac();
                if (tospkpz2gy5.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus != 8) {
                    if (Float.isNaN(tospkpz2gy5.MediaMetadataCompat) && Float.isNaN(tospkpz2gy5.RatingCompat) && Float.isNaN(tospkpz2gy5.MediaDescriptionCompat) && Float.isNaN(tospkpz2gy5.ParcelableVolumeInfo) && Float.isNaN(tospkpz2gy5.MediaSessionCompatToken) && Float.isNaN(tospkpz2gy5.ResultReceiver) && Float.isNaN(tospkpz2gy5.PlaybackStateCompat) && Float.isNaN(tospkpz2gy5.MediaSessionCompatResultReceiverWrapper) && Float.isNaN(tospkpz2gy5.write)) {
                        Placeable.PlacementScope.m2280place70tqf50$default(placementScope, placeable, IntOffsetKt.IntOffset(tospkpz2gy5.RemoteActionCompatParcelizer - IntOffset.m3801getXimpl(jM3812getZeronOccac), tospkpz2gy5.PlaybackStateCompatCustomAction - IntOffset.m3802getYimpl(jM3812getZeronOccac)), 0.0f, 2, null);
                    } else {
                        placementScope.placeWithLayer(placeable, tospkpz2gy5.RemoteActionCompatParcelizer - IntOffset.m3801getXimpl(jM3812getZeronOccac), tospkpz2gy5.PlaybackStateCompatCustomAction - IntOffset.m3802getYimpl(jM3812getZeronOccac), Float.isNaN(tospkpz2gy5.ResultReceiver) ? 0.0f : tospkpz2gy5.ResultReceiver, new CacheDrawScoperecord11(tospkpz2gy5));
                    }
                }
            }
        }
        if (DrawModifier.BOUNDS == null) {
            StringBuilder sbM = d$$ExternalSyntheticOutline0.m("{   root: {interpolated: { left:  0,  top:  0,");
            sbM.append("  right:   " + getuseintrinsicsize.MediaSessionCompatQueueItem() + " ,");
            sbM.append("  bottom:  " + getuseintrinsicsize.MediaDescriptionCompat() + " ,");
            sbM.append(" } }");
            for (setAlignment setalignment4 : getuseintrinsicsize.serializer) {
                Object obj2 = setalignment4._init_lambda3;
                if (!(obj2 instanceof Measurable)) {
                    if (setalignment4 instanceof setSizeToIntrinsics) {
                        sbM.append(" " + setalignment4.onSaveInstanceState + ": {");
                        setSizeToIntrinsics setsizetointrinsics = (setSizeToIntrinsics) setalignment4;
                        if (setsizetointrinsics.read == 0) {
                            sbM.append(" type: 'hGuideline', ");
                        } else {
                            sbM.append(" type: 'vGuideline', ");
                        }
                        sbM.append(" interpolated: ");
                        sbM.append(" { left: " + setsizetointrinsics.RatingCompat() + ", top: " + setsizetointrinsics.MediaSessionCompatToken() + ", right: " + (setsizetointrinsics.MediaSessionCompatQueueItem() + setsizetointrinsics.RatingCompat()) + ", bottom: " + (setsizetointrinsics.MediaDescriptionCompat() + setsizetointrinsics.MediaSessionCompatToken()) + " }");
                        sbM.append("}, ");
                    }
                } else {
                    if (setalignment4.onSaveInstanceState == null) {
                        Measurable measurable2 = (Measurable) obj2;
                        Object layoutId = LayoutIdKt.getLayoutId(measurable2);
                        if (layoutId == null) {
                            measurable2.getParentData();
                            layoutId = null;
                        }
                        setalignment4.onSaveInstanceState = layoutId != null ? layoutId.toString() : null;
                    }
                    toSpkPz2Gy4 tospkpz2gy6 = (toSpkPz2Gy4) linkedHashMap.get(r8lambdaNGtmLVJzMfxJG0dVSGRl8fYF5wE.write((Measurable) obj2));
                    toSpkPz2Gy4 tospkpz2gy7 = (tospkpz2gy6 == null || (setalignment = tospkpz2gy6.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY) == null) ? null : setalignment.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss;
                    if (tospkpz2gy7 != null) {
                        sbM.append(" " + setalignment4.onSaveInstanceState + ": {");
                        sbM.append(" interpolated : ");
                        HashMap map2 = tospkpz2gy7.read;
                        sbM.append("{\n");
                        toSpkPz2Gy4.IconCompatParcelizer(tospkpz2gy7.RemoteActionCompatParcelizer, "left", sbM);
                        toSpkPz2Gy4.IconCompatParcelizer(tospkpz2gy7.PlaybackStateCompatCustomAction, "top", sbM);
                        toSpkPz2Gy4.IconCompatParcelizer(tospkpz2gy7.MediaSessionCompatQueueItem, "right", sbM);
                        toSpkPz2Gy4.IconCompatParcelizer(tospkpz2gy7.serializer, "bottom", sbM);
                        toSpkPz2Gy4.RemoteActionCompatParcelizer(tospkpz2gy7.IconCompatParcelizer, "pivotX", sbM);
                        toSpkPz2Gy4.RemoteActionCompatParcelizer(tospkpz2gy7.MediaBrowserCompatMediaItem, "pivotY", sbM);
                        toSpkPz2Gy4.RemoteActionCompatParcelizer(tospkpz2gy7.MediaMetadataCompat, "rotationX", sbM);
                        toSpkPz2Gy4.RemoteActionCompatParcelizer(tospkpz2gy7.RatingCompat, "rotationY", sbM);
                        toSpkPz2Gy4.RemoteActionCompatParcelizer(tospkpz2gy7.MediaDescriptionCompat, "rotationZ", sbM);
                        toSpkPz2Gy4.RemoteActionCompatParcelizer(tospkpz2gy7.ParcelableVolumeInfo, "translationX", sbM);
                        toSpkPz2Gy4.RemoteActionCompatParcelizer(tospkpz2gy7.MediaSessionCompatToken, "translationY", sbM);
                        toSpkPz2Gy4.RemoteActionCompatParcelizer(tospkpz2gy7.ResultReceiver, "translationZ", sbM);
                        toSpkPz2Gy4.RemoteActionCompatParcelizer(tospkpz2gy7.PlaybackStateCompat, "scaleX", sbM);
                        toSpkPz2Gy4.RemoteActionCompatParcelizer(tospkpz2gy7.MediaSessionCompatResultReceiverWrapper, "scaleY", sbM);
                        toSpkPz2Gy4.RemoteActionCompatParcelizer(tospkpz2gy7.write, "alpha", sbM);
                        toSpkPz2Gy4.IconCompatParcelizer(tospkpz2gy7.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus, RemoteMessageConst.Notification.VISIBILITY, sbM);
                        toSpkPz2Gy4.RemoteActionCompatParcelizer(Float.NaN, "interpolatedPos", sbM);
                        setAlignment setalignment5 = tospkpz2gy7.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY;
                        if (setalignment5 != null) {
                            for (calculateScaledSizeE7KxVPU calculatescaledsizee7kxvpu : calculateScaledSizeE7KxVPU.values()) {
                                paintdefault paintdefaultVarRemoteActionCompatParcelizer = setalignment5.RemoteActionCompatParcelizer(calculatescaledsizee7kxvpu);
                                if (paintdefaultVarRemoteActionCompatParcelizer != null && paintdefaultVarRemoteActionCompatParcelizer.MediaSessionCompatQueueItem != null) {
                                    sbM.append("Anchor");
                                    sbM.append(calculatescaledsizee7kxvpu.name());
                                    sbM.append(": ['");
                                    String str = paintdefaultVarRemoteActionCompatParcelizer.MediaSessionCompatQueueItem.RatingCompat.onSaveInstanceState;
                                    if (str == null) {
                                        str = "#PARENT";
                                    }
                                    sbM.append(str);
                                    sbM.append("', '");
                                    sbM.append(paintdefaultVarRemoteActionCompatParcelizer.MediaSessionCompatQueueItem.MediaBrowserCompatMediaItem.name());
                                    sbM.append("', '");
                                    sbM.append(paintdefaultVarRemoteActionCompatParcelizer.IconCompatParcelizer);
                                    sbM.append("'],\n");
                                }
                            }
                        }
                        toSpkPz2Gy4.RemoteActionCompatParcelizer(Float.NaN, "phone_orientation", sbM);
                        toSpkPz2Gy4.RemoteActionCompatParcelizer(Float.NaN, "phone_orientation", sbM);
                        if (map2.size() != 0) {
                            sbM.append("custom : {\n");
                            for (String str2 : map2.keySet()) {
                                DrawWithContentModifier drawWithContentModifier = (DrawWithContentModifier) map2.get(str2);
                                sbM.append(str2);
                                sbM.append(": ");
                                switch (drawWithContentModifier.IconCompatParcelizer) {
                                    case 900:
                                        sbM.append(drawWithContentModifier.write);
                                        sbM.append(",\n");
                                        break;
                                    case 901:
                                        sbM.append(drawWithContentModifier.read);
                                        sbM.append(",\n");
                                        break;
                                    case 902:
                                        sbM.append("'");
                                        sbM.append(DrawWithContentModifier.RemoteActionCompatParcelizer(drawWithContentModifier.write));
                                        sbM.append("',\n");
                                        break;
                                    case 903:
                                        af$$ExternalSyntheticOutline0.m(sbM, "'", (String) null, "',\n");
                                        break;
                                }
                            }
                            sbM.append("}\n");
                        }
                        sbM.append("}\n");
                        sbM.append("}, ");
                    }
                }
            }
            sbM.append(" }");
        }
    }

    public Measurer2(Density density) {
        getUseIntrinsicSize getuseintrinsicsize = new getUseIntrinsicSize(0, 0);
        getuseintrinsicsize.serializer = new ArrayList();
        getuseintrinsicsize.read = new EmojiProcessor(getuseintrinsicsize);
        ThumbFetcher thumbFetcher = new ThumbFetcher(getuseintrinsicsize);
        getuseintrinsicsize.write = thumbFetcher;
        getuseintrinsicsize.MediaSessionCompatResultReceiverWrapper = null;
        getuseintrinsicsize.RatingCompat = false;
        getuseintrinsicsize.ComponentActivity = new DrawWithContentElement();
        getuseintrinsicsize.MediaDescriptionCompat = 0;
        getuseintrinsicsize.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus = 0;
        getuseintrinsicsize.ResultReceiver = new PainterNode[4];
        getuseintrinsicsize.IconCompatParcelizer = new PainterNode[4];
        getuseintrinsicsize.PlaybackStateCompatCustomAction = 257;
        getuseintrinsicsize.removeMenuProvider = false;
        getuseintrinsicsize.RemoteActionCompatParcelizer = false;
        getuseintrinsicsize.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = null;
        getuseintrinsicsize.MediaBrowserCompatMediaItem = null;
        getuseintrinsicsize.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = null;
        getuseintrinsicsize.MediaSessionCompatQueueItem = null;
        getuseintrinsicsize.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8 = new HashSet();
        getuseintrinsicsize.MediaMetadataCompat = new RotateKt();
        getuseintrinsicsize.MediaSessionCompatResultReceiverWrapper = this;
        thumbFetcher.MediaSessionCompatQueueItem = this;
        this.write = getuseintrinsicsize;
        this.read = new LinkedHashMap();
        this.serializer = new LinkedHashMap();
        this.RemoteActionCompatParcelizer = new LinkedHashMap();
        this.MediaSessionCompatQueueItem = new drawBehind(density);
        this.MediaMetadataCompat = new int[2];
        this.IconCompatParcelizer = new int[2];
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:40:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:46:0x0104  */
    /* JADX WARN: Code duplicated, block: B:47:0x0112  */
    /* JADX WARN: Code duplicated, block: B:49:0x0115  */
    /* JADX WARN: Code duplicated, block: B:51:0x0124  */
    /* JADX WARN: Code duplicated, block: B:74:0x018f  */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x00ab, please report this as an issue */
    @Override // o.rotate
    public final void measure(setAlignment setalignment, RotateKt rotateKt) {
        int i;
        int i2;
        Integer numValueOf;
        int i3;
        Integer numValueOf2;
        int iIntValue;
        int i4;
        int i5;
        Integer numValueOf3;
        int iIntValue2;
        boolean z;
        int iMediaSessionCompatQueueItem;
        int iMediaDescriptionCompat;
        int i6;
        String str = setalignment.onSaveInstanceState;
        LinkedHashMap linkedHashMap = this.serializer;
        Integer[] numArr = (Integer[]) linkedHashMap.get(str);
        hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk = rotateKt.read;
        int i7 = rotateKt.IconCompatParcelizer;
        int i8 = setalignment.addOnConfigurationChangedListener;
        int i9 = rotateKt.RemoteActionCompatParcelizer;
        boolean z2 = (numArr != null ? numArr[1].intValue() : 0) == setalignment.MediaDescriptionCompat();
        boolean zJ_ = setalignment.j_();
        drawBehind drawbehind = this.MediaSessionCompatQueueItem;
        boolean z3 = true;
        RemoteActionCompatParcelizer(hasspecifiedandfiniteheightuvyycjk, i7, i8, i9, z2, zJ_, Constraints.m3626getMaxWidthimpl(drawbehind.MediaSessionCompatResultReceiverWrapper), this.MediaMetadataCompat);
        RemoteActionCompatParcelizer(rotateKt.MediaBrowserCompatMediaItem, rotateKt.MediaMetadataCompat, setalignment.addMenuProvider, rotateKt.RemoteActionCompatParcelizer, (numArr != null ? numArr[0].intValue() : 0) == setalignment.MediaSessionCompatQueueItem(), setalignment.RemoteActionCompatParcelizer(), Constraints.m3625getMaxHeightimpl(drawbehind.MediaSessionCompatResultReceiverWrapper), this.IconCompatParcelizer);
        int[] iArr = this.MediaMetadataCompat;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int[] iArr2 = this.IconCompatParcelizer;
        long jConstraints = ConstraintsKt.Constraints(i10, i11, iArr2[0], iArr2[1]);
        int i12 = rotateKt.RemoteActionCompatParcelizer;
        if (i12 != 1 && i12 != 2) {
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk2 = rotateKt.read;
            hasSpecifiedAndFiniteHeightuvyYCjk hasspecifiedandfiniteheightuvyycjk3 = hasSpecifiedAndFiniteHeightuvyYCjk.MATCH_CONSTRAINT;
            if (hasspecifiedandfiniteheightuvyycjk2 != hasspecifiedandfiniteheightuvyycjk3 || setalignment.addOnConfigurationChangedListener != 0 || rotateKt.MediaBrowserCompatMediaItem != hasspecifiedandfiniteheightuvyycjk3 || setalignment.addMenuProvider != 0) {
                long jRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(setalignment, jConstraints);
                setalignment.getDefaultViewModelProviderFactory = false;
                i = (int) (jRemoteActionCompatParcelizer >> 32);
                i2 = setalignment.addOnTrimMemoryListener;
                numValueOf = Integer.valueOf(i2);
                if (i2 <= 0) {
                    numValueOf = null;
                }
                i3 = setalignment.addOnPictureInPictureUiStateChangedListener;
                if (i3 > 0) {
                    numValueOf2 = Integer.valueOf(i3);
                } else {
                    numValueOf2 = null;
                }
                iIntValue = ((Number) RangesKt.write(Integer.valueOf(i), numValueOf, numValueOf2)).intValue();
                i4 = (int) (jRemoteActionCompatParcelizer & 4294967295L);
                i5 = setalignment.enterPictureInPictureMode;
                numValueOf3 = Integer.valueOf(i5);
                if (i5 <= 0) {
                    numValueOf3 = null;
                }
                int i13 = setalignment.addOnPictureInPictureModeChangedListener;
                iIntValue2 = ((Number) RangesKt.write(Integer.valueOf(i4), numValueOf3, i13 > 0 ? Integer.valueOf(i13) : null)).intValue();
                if (iIntValue != i) {
                    jConstraints = ConstraintsKt.Constraints(iIntValue, iIntValue, Constraints.m3627getMinHeightimpl(jConstraints), Constraints.m3625getMaxHeightimpl(jConstraints));
                    z = true;
                } else {
                    z = false;
                }
                if (iIntValue2 != i4) {
                    jConstraints = ConstraintsKt.Constraints(Constraints.m3628getMinWidthimpl(jConstraints), Constraints.m3626getMaxWidthimpl(jConstraints), iIntValue2, iIntValue2);
                    z = true;
                }
                if (z) {
                    RemoteActionCompatParcelizer(setalignment, jConstraints);
                    setalignment.getDefaultViewModelProviderFactory = false;
                }
            }
        } else {
            long jRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(setalignment, jConstraints);
            setalignment.getDefaultViewModelProviderFactory = false;
            i = (int) (jRemoteActionCompatParcelizer2 >> 32);
            i2 = setalignment.addOnTrimMemoryListener;
            numValueOf = Integer.valueOf(i2);
            if (i2 <= 0) {
                numValueOf = null;
            }
            i3 = setalignment.addOnPictureInPictureUiStateChangedListener;
            if (i3 > 0) {
                numValueOf2 = Integer.valueOf(i3);
            } else {
                numValueOf2 = null;
            }
            iIntValue = ((Number) RangesKt.write(Integer.valueOf(i), numValueOf, numValueOf2)).intValue();
            i4 = (int) (jRemoteActionCompatParcelizer2 & 4294967295L);
            i5 = setalignment.enterPictureInPictureMode;
            numValueOf3 = Integer.valueOf(i5);
            if (i5 <= 0) {
                numValueOf3 = null;
            }
            int i14 = setalignment.addOnPictureInPictureModeChangedListener;
            iIntValue2 = ((Number) RangesKt.write(Integer.valueOf(i4), numValueOf3, i14 > 0 ? Integer.valueOf(i14) : null)).intValue();
            if (iIntValue != i) {
                jConstraints = ConstraintsKt.Constraints(iIntValue, iIntValue, Constraints.m3627getMinHeightimpl(jConstraints), Constraints.m3625getMaxHeightimpl(jConstraints));
                z = true;
            } else {
                z = false;
            }
            if (iIntValue2 != i4) {
                jConstraints = ConstraintsKt.Constraints(Constraints.m3628getMinWidthimpl(jConstraints), Constraints.m3626getMaxWidthimpl(jConstraints), iIntValue2, iIntValue2);
                z = true;
            }
            if (z) {
                RemoteActionCompatParcelizer(setalignment, jConstraints);
                setalignment.getDefaultViewModelProviderFactory = false;
            }
        }
        Placeable placeable = (Placeable) this.read.get(setalignment._init_lambda3);
        if (placeable != null) {
            iMediaSessionCompatQueueItem = placeable.getWidth();
        } else {
            iMediaSessionCompatQueueItem = setalignment.MediaSessionCompatQueueItem();
        }
        rotateKt.RatingCompat = iMediaSessionCompatQueueItem;
        if (placeable != null) {
            iMediaDescriptionCompat = placeable.getHeight();
        } else {
            iMediaDescriptionCompat = setalignment.MediaDescriptionCompat();
        }
        rotateKt.MediaDescriptionCompat = iMediaDescriptionCompat;
        if (placeable != null) {
            ArrayList arrayList = drawbehind.serializer;
            if (drawbehind.read) {
                arrayList.clear();
                Iterator it = drawbehind.RemoteActionCompatParcelizer.iterator();
                while (it.hasNext()) {
                    setAlignment setalignmentWrite = ((toPx0680j_4) drawbehind.MediaMetadataCompat.get(it.next())).write();
                    if (setalignmentWrite != null) {
                        arrayList.add(setalignmentWrite);
                    }
                }
                drawbehind.read = false;
            }
            if (arrayList.contains(setalignment)) {
                i6 = placeable.get(AlignmentLineKt.getFirstBaseline());
            } else {
                i6 = Integer.MIN_VALUE;
            }
        } else {
            i6 = Integer.MIN_VALUE;
        }
        rotateKt.write = i6 != Integer.MIN_VALUE;
        rotateKt.serializer = i6;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = new Integer[]{0, 0, Integer.MIN_VALUE};
            linkedHashMap.put(str, obj);
        }
        Integer[] numArr2 = (Integer[]) obj;
        numArr2[0] = Integer.valueOf(rotateKt.RatingCompat);
        numArr2[1] = Integer.valueOf(rotateKt.MediaDescriptionCompat);
        numArr2[2] = Integer.valueOf(rotateKt.serializer);
        if (rotateKt.RatingCompat == rotateKt.IconCompatParcelizer && rotateKt.MediaDescriptionCompat == rotateKt.MediaMetadataCompat) {
            z3 = false;
        }
        rotateKt.MediaSessionCompatQueueItem = z3;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:118:0x0170 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:132:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:133:0x01d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x0241 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x021b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00fe A[LOOP:1: B:39:0x00f8->B:41:0x00fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:45:0x0160  */
    /* JADX WARN: Code duplicated, block: B:49:0x0178  */
    /* JADX WARN: Code duplicated, block: B:54:0x018e  */
    /* JADX WARN: Code duplicated, block: B:67:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:71:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:77:0x020b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0227 A[LOOP:6: B:80:0x0221->B:82:0x0227, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:88:0x0253  */
    /* JADX INFO: renamed from: performMeasure-DjhGOtQ, reason: not valid java name */
    public final long m3945performMeasureDjhGOtQ(long j, LayoutDirection layoutDirection, DrawBackgroundModifier drawBackgroundModifier, List list, LinkedHashMap linkedHashMap) {
        accesstoSpkPz2Gy4jd accesstospkpz2gy4jd;
        accesstoSpkPz2Gy4jd accesstospkpz2gy4jd2;
        Iterator it;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        setAlignment setalignmentWrite;
        toPx0680j_4 topx0680j_4;
        toDpu2uoSUM todpu2uosum;
        setPainter setpainterMediaDescriptionCompat;
        toDpu2uoSUM todpu2uosum2;
        Iterator it5;
        toPx0680j_4 topx0680j_5;
        toPx0680j_4 topx0680j_6;
        setPainter setpainterMediaDescriptionCompat2;
        setPainter setpainterMediaDescriptionCompat3;
        toPx0680j_4 topx0680j_4Write;
        this.read = linkedHashMap;
        if (list.isEmpty()) {
            return IntSizeKt.IntSize(Constraints.m3628getMinWidthimpl(j), Constraints.m3627getMinHeightimpl(j));
        }
        boolean zM3624getHasFixedWidthimpl = Constraints.m3624getHasFixedWidthimpl(j);
        String str = accesstoSpkPz2Gy4jd.MediaSessionCompatQueueItem;
        if (zM3624getHasFixedWidthimpl) {
            accesstospkpz2gy4jd = accesstoSpkPz2Gy4jd.read(Constraints.m3626getMaxWidthimpl(j));
        } else {
            accesstospkpz2gy4jd = new accesstoSpkPz2Gy4jd(str);
            int iM3628getMinWidthimpl = Constraints.m3628getMinWidthimpl(j);
            if (iM3628getMinWidthimpl >= 0) {
                accesstospkpz2gy4jd.RatingCompat = iM3628getMinWidthimpl;
            }
        }
        drawBehind drawbehind = this.MediaSessionCompatQueueItem;
        accesstoSizeXkaWNTQjd accesstosizexkawntqjd = drawbehind.MediaDescriptionCompat;
        HashMap map = drawbehind.MediaSessionCompatQueueItem;
        HashMap map2 = drawbehind.MediaMetadataCompat;
        accesstoSizeXkaWNTQjd accesstosizexkawntqjd2 = drawbehind.MediaDescriptionCompat;
        accesstosizexkawntqjd.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = accesstospkpz2gy4jd;
        if (Constraints.m3623getHasFixedHeightimpl(j)) {
            accesstospkpz2gy4jd2 = accesstoSpkPz2Gy4jd.read(Constraints.m3625getMaxHeightimpl(j));
        } else {
            accesstospkpz2gy4jd2 = new accesstoSpkPz2Gy4jd(str);
            int iM3627getMinHeightimpl = Constraints.m3627getMinHeightimpl(j);
            if (iM3627getMinHeightimpl >= 0) {
                accesstospkpz2gy4jd2.RatingCompat = iM3627getMinHeightimpl;
            }
        }
        accesstosizexkawntqjd2.addOnUserLeaveHintListener = accesstospkpz2gy4jd2;
        accesstoSpkPz2Gy4jd accesstospkpz2gy4jd3 = accesstosizexkawntqjd2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys;
        getUseIntrinsicSize getuseintrinsicsize = this.write;
        int i = 0;
        accesstospkpz2gy4jd3.read(getuseintrinsicsize, 0);
        accesstosizexkawntqjd2.addOnUserLeaveHintListener.read(getuseintrinsicsize, 1);
        drawbehind.MediaSessionCompatResultReceiverWrapper = j;
        drawbehind.MediaBrowserCompatMediaItem = !(layoutDirection == LayoutDirection.Rtl);
        this.read.clear();
        this.serializer.clear();
        this.RemoteActionCompatParcelizer.clear();
        ArrayList arrayList = drawBackgroundModifier.serializer;
        if (!drawBackgroundModifier.write && list.size() == arrayList.size()) {
            int size = list.size();
            int i2 = 0;
            while (true) {
                if (i2 < size) {
                    Object parentData = ((Measurable) list.get(i2)).getParentData();
                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{parentData instanceof getOnDraw ? (getOnDraw) parentData : null, arrayList.get(i2)}, getCieXyz.write())).booleanValue()) {
                        break;
                    }
                    i2++;
                } else {
                    ConstraintLayoutKt.buildMapping(drawbehind, list);
                }
            }
            it = map2.keySet().iterator();
            while (it.hasNext()) {
                ((toPx0680j_4) map2.get(it.next())).write().MediaSessionCompatResultReceiverWrapper();
            }
            map2.clear();
            map2.put(0, accesstosizexkawntqjd2);
            map.clear();
            drawbehind.ParcelableVolumeInfo.clear();
            drawbehind.RemoteActionCompatParcelizer.clear();
            drawbehind.read = true;
            drawBackgroundModifier.serializer.clear();
            drawBackgroundModifier.read.serializer(createFromParcel.INSTANCE, drawBackgroundModifier.RemoteActionCompatParcelizer, new ConstraintSetForInlineDsl$applyTo$1(list, drawBackgroundModifier, drawbehind, i));
            drawBackgroundModifier.write = false;
            ConstraintLayoutKt.buildMapping(drawbehind, list);
            getuseintrinsicsize.serializer.clear();
            accesstosizexkawntqjd2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read(getuseintrinsicsize, 0);
            accesstosizexkawntqjd2.addOnUserLeaveHintListener.read(getuseintrinsicsize, 1);
            for (Object obj : map.keySet()) {
                setpainterMediaDescriptionCompat3 = ((toDpu2uoSUM) map.get(obj)).MediaDescriptionCompat();
                if (setpainterMediaDescriptionCompat3 == null) {
                    topx0680j_4Write = (toPx0680j_4) map2.get(obj);
                    if (topx0680j_4Write == null) {
                        topx0680j_4Write = drawbehind.write(obj);
                    }
                    topx0680j_4Write.read(setpainterMediaDescriptionCompat3);
                }
            }
            while (r1.hasNext()) {
                topx0680j_6 = (toPx0680j_4) map2.get(obj);
                if (topx0680j_6 == accesstosizexkawntqjd2) {
                }
            }
            it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                topx0680j_5 = (toPx0680j_4) map2.get(it2.next());
                if (topx0680j_5 != accesstosizexkawntqjd2) {
                    setAlignment setalignmentWrite2 = topx0680j_5.write();
                    setalignmentWrite2.accessensureViewModelStore = topx0680j_5.MediaBrowserCompatMediaItem().toString();
                    setalignmentWrite2.getViewModelStore = null;
                    if (topx0680j_5.MediaSessionCompatQueueItem() instanceof getContentScale) {
                        topx0680j_5.read();
                    }
                    getuseintrinsicsize.serializer(setalignmentWrite2);
                } else {
                    topx0680j_5.read(getuseintrinsicsize);
                }
            }
            it3 = map.keySet().iterator();
            while (it3.hasNext()) {
                todpu2uosum2 = (toDpu2uoSUM) map.get(it3.next());
                if (todpu2uosum2.MediaDescriptionCompat() != null) {
                    it5 = todpu2uosum2.getDefaultViewModelProviderFactory.iterator();
                    while (it5.hasNext()) {
                        todpu2uosum2.MediaDescriptionCompat().write(((toPx0680j_4) map2.get(it5.next())).write());
                    }
                    todpu2uosum2.read();
                } else {
                    todpu2uosum2.read();
                }
            }
            it4 = map2.keySet().iterator();
            while (it4.hasNext()) {
                topx0680j_4 = (toPx0680j_4) map2.get(it4.next());
                if (topx0680j_4 == accesstosizexkawntqjd2) {
                }
            }
            while (r1.hasNext()) {
                toPx0680j_4 topx0680j_7 = (toPx0680j_4) map2.get(obj);
                topx0680j_7.read();
                setalignmentWrite = topx0680j_7.write();
                if (setalignmentWrite == null) {
                }
            }
        } else {
            it = map2.keySet().iterator();
            while (it.hasNext()) {
                ((toPx0680j_4) map2.get(it.next())).write().MediaSessionCompatResultReceiverWrapper();
            }
            map2.clear();
            map2.put(0, accesstosizexkawntqjd2);
            map.clear();
            drawbehind.ParcelableVolumeInfo.clear();
            drawbehind.RemoteActionCompatParcelizer.clear();
            drawbehind.read = true;
            drawBackgroundModifier.serializer.clear();
            drawBackgroundModifier.read.serializer(createFromParcel.INSTANCE, drawBackgroundModifier.RemoteActionCompatParcelizer, new ConstraintSetForInlineDsl$applyTo$1(list, drawBackgroundModifier, drawbehind, i));
            drawBackgroundModifier.write = false;
            ConstraintLayoutKt.buildMapping(drawbehind, list);
            getuseintrinsicsize.serializer.clear();
            accesstosizexkawntqjd2.r8lambda54BeH8ZsBru0CXI2CCSP2syNys.read(getuseintrinsicsize, 0);
            accesstosizexkawntqjd2.addOnUserLeaveHintListener.read(getuseintrinsicsize, 1);
            while (r1.hasNext()) {
                setpainterMediaDescriptionCompat3 = ((toDpu2uoSUM) map.get(obj)).MediaDescriptionCompat();
                if (setpainterMediaDescriptionCompat3 == null) {
                    topx0680j_4Write = (toPx0680j_4) map2.get(obj);
                    if (topx0680j_4Write == null) {
                        topx0680j_4Write = drawbehind.write(obj);
                    }
                    topx0680j_4Write.read(setpainterMediaDescriptionCompat3);
                }
            }
            for (Object obj2 : map2.keySet()) {
                topx0680j_6 = (toPx0680j_4) map2.get(obj2);
                if (topx0680j_6 == accesstosizexkawntqjd2 && (topx0680j_6.MediaSessionCompatQueueItem() instanceof toDpu2uoSUM) && (setpainterMediaDescriptionCompat2 = ((toDpu2uoSUM) topx0680j_6.MediaSessionCompatQueueItem()).MediaDescriptionCompat()) != null) {
                    toPx0680j_4 topx0680j_4Write2 = (toPx0680j_4) map2.get(obj2);
                    if (topx0680j_4Write2 == null) {
                        topx0680j_4Write2 = drawbehind.write(obj2);
                    }
                    topx0680j_4Write2.read(setpainterMediaDescriptionCompat2);
                }
            }
            it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                topx0680j_5 = (toPx0680j_4) map2.get(it2.next());
                if (topx0680j_5 != accesstosizexkawntqjd2) {
                    setAlignment setalignmentWrite3 = topx0680j_5.write();
                    setalignmentWrite3.accessensureViewModelStore = topx0680j_5.MediaBrowserCompatMediaItem().toString();
                    setalignmentWrite3.getViewModelStore = null;
                    if (topx0680j_5.MediaSessionCompatQueueItem() instanceof getContentScale) {
                        topx0680j_5.read();
                    }
                    getuseintrinsicsize.serializer(setalignmentWrite3);
                } else {
                    topx0680j_5.read(getuseintrinsicsize);
                }
            }
            it3 = map.keySet().iterator();
            while (it3.hasNext()) {
                todpu2uosum2 = (toDpu2uoSUM) map.get(it3.next());
                if (todpu2uosum2.MediaDescriptionCompat() != null) {
                    it5 = todpu2uosum2.getDefaultViewModelProviderFactory.iterator();
                    while (it5.hasNext()) {
                        todpu2uosum2.MediaDescriptionCompat().write(((toPx0680j_4) map2.get(it5.next())).write());
                    }
                    todpu2uosum2.read();
                } else {
                    todpu2uosum2.read();
                }
            }
            it4 = map2.keySet().iterator();
            while (it4.hasNext()) {
                topx0680j_4 = (toPx0680j_4) map2.get(it4.next());
                if (topx0680j_4 == accesstosizexkawntqjd2 && (topx0680j_4.MediaSessionCompatQueueItem() instanceof toDpu2uoSUM) && (setpainterMediaDescriptionCompat = (todpu2uosum = (toDpu2uoSUM) topx0680j_4.MediaSessionCompatQueueItem()).MediaDescriptionCompat()) != null) {
                    for (Object obj3 : todpu2uosum.getDefaultViewModelProviderFactory) {
                        toPx0680j_4 topx0680j_8 = (toPx0680j_4) map2.get(obj3);
                        if (topx0680j_8 != null) {
                            setpainterMediaDescriptionCompat.write(topx0680j_8.write());
                        } else if (obj3 instanceof toPx0680j_4) {
                            setpainterMediaDescriptionCompat.write(((toPx0680j_4) obj3).write());
                        } else {
                            System.out.println("couldn't find reference for " + obj3);
                        }
                    }
                    topx0680j_4.read();
                }
            }
            for (Object obj4 : map2.keySet()) {
                toPx0680j_4 topx0680j_9 = (toPx0680j_4) map2.get(obj4);
                topx0680j_9.read();
                setalignmentWrite = topx0680j_9.write();
                if (setalignmentWrite == null && obj4 != null) {
                    setalignmentWrite.onSaveInstanceState = obj4.toString();
                }
            }
        }
        getuseintrinsicsize.MediaSessionCompatQueueItem(Constraints.m3626getMaxWidthimpl(j));
        getuseintrinsicsize.MediaMetadataCompat(Constraints.m3625getMaxHeightimpl(j));
        getuseintrinsicsize.read.read(getuseintrinsicsize);
        getuseintrinsicsize.PlaybackStateCompatCustomAction = 257;
        DrawWithContentElement.write = getuseintrinsicsize.RemoteActionCompatParcelizer(Fields.RotationY);
        getuseintrinsicsize.write(getuseintrinsicsize.PlaybackStateCompatCustomAction, 0, 0, 0, 0, 0, 0);
        return IntSizeKt.IntSize(getuseintrinsicsize.MediaSessionCompatQueueItem(), getuseintrinsicsize.MediaDescriptionCompat());
    }
}
