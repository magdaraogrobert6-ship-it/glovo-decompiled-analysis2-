package com.roadrunner.delivery.accept.overlay.domain;

import androidx.compose.ui.graphics.Fields;
import coil3.ExtrasKt;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.huawei.location.Vw$Vw;
import com.logistics.rider.glovo.R;
import com.mapbox.geojson.Point;
import com.roadrunner.delivery.ontheway.crowdsourcing.floating.presentation.CrowdSourcingFloatingImageButtonUiModelImpl;
import com.roadrunner.remoteconfig.firebase.FirebaseRemoteConfigImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.TuplesKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.MutableStateFlow;
import o.BrazeExternalSyntheticLambda28;
import o.IndentationFixSpan;
import o.InputMethodManager;
import o.InputMethodManagerImpl;
import o.InputState_androidKt;
import o.MathUtilsKt;
import o.NullableInputConnectionWrapper;
import o.NullableInputConnectionWrapperApi21;
import o.NullableInputConnectionWrapperApi34;
import o.OffsetMapping;
import o.OffsetMappingCompanion;
import o.Paint29;
import o.PaintExtensions_androidKt;
import o.PartialGapBuffer;
import o.PartialGapBufferCompanion;
import o.ShortNewsContentCardView;
import o.StaticLayoutFactoryDefault;
import o.accessgetInstancedelegatecp;
import o.addExactOrElse;
import o.beginBatchEdit;
import o.copyYTHSh70default;
import o.copyuxg59PA;
import o.createFromParcel;
import o.disposeDelegate;
import o.drawARGB;
import o.drawLine;
import o.drawTextOnPath;
import o.g6;
import o.getAmount;
import o.getBottomPaddingui_textannotations;
import o.getDrawFilter;
import o.getEllipsizedRightPadding;
import o.getEndOffsetForRectWithinRun;
import o.getHintLocales;
import o.getIdentity;
import o.getImm;
import o.getLineForVertical;
import o.getLineForVerticalUnbounded;
import o.getMaximumBitmapHeight;
import o.getSingleLine;
import o.hideCurrentlyDisplayingInAppMessage;
import o.hideSoftInput;
import o.instance_delegatelambda0;
import o.isOpaque;
import o.notifyFocusedRect;
import o.onContentCardDismissed;
import o.originalToTransformed;
import o.performHandwritingGesture;
import o.r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk;
import o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.restartInput;
import o.saveLayerAlpha;
import o.setDrawFilter;
import o.setMatrix;
import o.setTransactionSuccessful;
import o.showSoftInput;
import o.subtractExactOrElse;
import o.transformedToOriginal;
import o.updateAdidI;
import o.updateExtractedText;
import o.withCanvas;
import timber.log.Timber;

/* JADX INFO: loaded from: classes3.dex */
public final class ObserveAcceptOverlayVisibility$invoke$1 extends SuspendLambda implements r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY {
    private static int RatingCompat = 1;
    private static int write;
    public /* synthetic */ Object IconCompatParcelizer;
    public /* synthetic */ Object RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final /* synthetic */ Object serializer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ObserveAcceptOverlayVisibility$invoke$1(Object obj, ShortNewsContentCardView shortNewsContentCardView, int i) {
        super(3, shortNewsContentCardView);
        this.read = i;
        this.serializer = obj;
    }

    @Override // o.r8lambdafjQ9B8d5OSR_i2BAJDXqNW6RNrY
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = 2;
        int i2 = 2 % 2;
        int i3 = write + 23;
        RatingCompat = i3 % Fields.SpotShadowColor;
        int i4 = i3 % 2;
        int i5 = this.read;
        createFromParcel createfromparcel = createFromParcel.INSTANCE;
        Object obj4 = this.serializer;
        if (i5 == 0) {
            ObserveAcceptOverlayVisibility$invoke$1 observeAcceptOverlayVisibility$invoke$1 = new ObserveAcceptOverlayVisibility$invoke$1((StaticLayoutFactoryDefault) obj4, (ShortNewsContentCardView) obj3, 0);
            observeAcceptOverlayVisibility$invoke$1.IconCompatParcelizer = (IndentationFixSpan) obj;
            observeAcceptOverlayVisibility$invoke$1.RemoteActionCompatParcelizer = (PaintExtensions_androidKt) obj2;
            return observeAcceptOverlayVisibility$invoke$1.invokeSuspend(createfromparcel);
        }
        int i6 = 1;
        if (i5 == 1) {
            ObserveAcceptOverlayVisibility$invoke$1 observeAcceptOverlayVisibility$invoke$2 = new ObserveAcceptOverlayVisibility$invoke$1((getLineForVertical) obj4, (ShortNewsContentCardView) obj3, i6);
            observeAcceptOverlayVisibility$invoke$2.IconCompatParcelizer = (drawLine) obj;
            observeAcceptOverlayVisibility$invoke$2.RemoteActionCompatParcelizer = (List) obj2;
            return observeAcceptOverlayVisibility$invoke$2.invokeSuspend(createfromparcel);
        }
        if (i5 == 2) {
            ObserveAcceptOverlayVisibility$invoke$1 observeAcceptOverlayVisibility$invoke$3 = new ObserveAcceptOverlayVisibility$invoke$1((getEndOffsetForRectWithinRun) obj4, (ShortNewsContentCardView) obj3, i);
            observeAcceptOverlayVisibility$invoke$3.IconCompatParcelizer = (drawLine) obj;
            observeAcceptOverlayVisibility$invoke$3.RemoteActionCompatParcelizer = (g6) obj2;
            observeAcceptOverlayVisibility$invoke$3.invokeSuspend(createfromparcel);
            return createfromparcel;
        }
        int i7 = 3;
        if (i5 == 3) {
            ObserveAcceptOverlayVisibility$invoke$1 observeAcceptOverlayVisibility$invoke$4 = new ObserveAcceptOverlayVisibility$invoke$1((CrowdSourcingFloatingImageButtonUiModelImpl) obj4, (ShortNewsContentCardView) obj3, i7);
            observeAcceptOverlayVisibility$invoke$4.IconCompatParcelizer = (copyYTHSh70default) obj;
            observeAcceptOverlayVisibility$invoke$4.RemoteActionCompatParcelizer = (beginBatchEdit) obj2;
            return observeAcceptOverlayVisibility$invoke$4.invokeSuspend(createfromparcel);
        }
        ObserveAcceptOverlayVisibility$invoke$1 observeAcceptOverlayVisibility$invoke$5 = new ObserveAcceptOverlayVisibility$invoke$1((notifyFocusedRect) obj4, (ShortNewsContentCardView) obj3, 4);
        observeAcceptOverlayVisibility$invoke$5.IconCompatParcelizer = (originalToTransformed) obj;
        observeAcceptOverlayVisibility$invoke$5.RemoteActionCompatParcelizer = (OffsetMappingCompanion) obj2;
        Object objInvokeSuspend = observeAcceptOverlayVisibility$invoke$5.invokeSuspend(createfromparcel);
        int i8 = write + 53;
        RatingCompat = i8 % Fields.SpotShadowColor;
        if (i8 % 2 != 0) {
            return objInvokeSuspend;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:117:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:120:0x02e4 A[LOOP:4: B:118:0x02de->B:120:0x02e4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:124:0x0309  */
    /* JADX WARN: Code duplicated, block: B:126:0x0340  */
    /* JADX WARN: Code duplicated, block: B:127:0x034b  */
    /* JADX WARN: Code duplicated, block: B:130:0x0354  */
    /* JADX WARN: Code duplicated, block: B:133:0x036d A[LOOP:3: B:131:0x0367->B:133:0x036d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:139:0x039d  */
    /* JADX WARN: Code duplicated, block: B:141:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:143:0x03ad  */
    /* JADX WARN: Code duplicated, block: B:145:0x03be  */
    /* JADX WARN: Code duplicated, block: B:147:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:149:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:158:0x00bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        getMaximumBitmapHeight getmaximumbitmapheight;
        Object obj2;
        saveLayerAlpha setmatrix;
        int i;
        String str;
        Object obj3;
        ArrayList arrayList;
        ArrayList arrayList2;
        getDrawFilter getdrawfilter;
        ArrayList arrayList3;
        Object obj4;
        getBottomPaddingui_textannotations getbottompaddingui_textannotations;
        drawTextOnPath drawtextonpath;
        String str2;
        r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer;
        boolean z;
        hideSoftInput hidesoftinput;
        getImm getimmRemoteActionCompatParcelizer;
        PartialGapBuffer partialGapBuffer;
        getImm getimmRemoteActionCompatParcelizer2;
        Boolean boolValueOf;
        PartialGapBuffer partialGapBufferSerializer;
        int i2;
        int i3 = 2 % 2;
        int i4 = this.read;
        Object obj5 = this.serializer;
        if (i4 == 0) {
            IndentationFixSpan indentationFixSpan = (IndentationFixSpan) this.IconCompatParcelizer;
            PaintExtensions_androidKt paintExtensions_androidKt = (PaintExtensions_androidKt) this.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            return paintExtensions_androidKt instanceof Paint29 ? new getEllipsizedRightPadding((StaticLayoutFactoryDefault) obj5) : indentationFixSpan;
        }
        if (i4 == 1) {
            getLineForVertical getlineforvertical = (getLineForVertical) obj5;
            drawLine drawline = (drawLine) this.IconCompatParcelizer;
            List list = (List) this.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (!(drawline instanceof drawTextOnPath)) {
                return null;
            }
            drawTextOnPath drawtextonpath2 = (drawTextOnPath) drawline;
            getMaximumBitmapHeight getmaximumbitmapheight2 = drawtextonpath2.MediaSessionCompatQueueItem;
            getDrawFilter getdrawfilter2 = drawtextonpath2.IconCompatParcelizer;
            if (((FirebaseRemoteConfigImpl) getlineforvertical.IconCompatParcelizer.RemoteActionCompatParcelizer).IconCompatParcelizer(updateAdidI.LAST_STOP_SAVING_ADDRESS_ENABLED)) {
                int i5 = RatingCompat + 73;
                write = i5 % Fields.SpotShadowColor;
                if (i5 % 2 != 0) {
                    int i6 = 83 / 0;
                    if (getdrawfilter2 != null) {
                        List<drawARGB> list2 = list;
                        arrayList = new ArrayList(accessgetInstancedelegatecp.write(list2, 10));
                        for (drawARGB drawargb : list2) {
                            arrayList.add(new getDrawFilter(drawargb.address, drawargb.lat, drawargb.f9long));
                        }
                        arrayList2 = new ArrayList();
                        for (Object obj6 : arrayList) {
                            int i7 = RatingCompat + 109;
                            write = i7 % Fields.SpotShadowColor;
                            int i8 = i7 % 2;
                            getdrawfilter = (getDrawFilter) obj6;
                            getLineForVerticalUnbounded getlineforverticalunbounded = getlineforvertical.read;
                            getdrawfilter2.getClass();
                            getdrawfilter.getClass();
                            getMaximumBitmapHeight getmaximumbitmapheight3 = getmaximumbitmapheight2;
                            if (TuplesKt.distance(Point.fromLngLat(getdrawfilter2.read, getdrawfilter2.serializer), Point.fromLngLat(getdrawfilter.read, getdrawfilter.serializer), "meters") <= 10.0d) {
                                int i9 = write + 123;
                                RatingCompat = i9 % Fields.SpotShadowColor;
                                int i10 = i9 % 2;
                            } else {
                                arrayList2.add(obj6);
                            }
                            getmaximumbitmapheight2 = getmaximumbitmapheight3;
                        }
                        getmaximumbitmapheight = getmaximumbitmapheight2;
                        obj2 = arrayList2;
                    } else {
                        List<drawARGB> list3 = list;
                        arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list3, 10));
                        for (drawARGB drawargb2 : list3) {
                            arrayList3.add(new getDrawFilter(drawargb2.address, drawargb2.lat, drawargb2.f9long));
                        }
                        obj3 = arrayList3;
                    }
                } else if (getdrawfilter2 != null) {
                    List<drawARGB> list4 = list;
                    arrayList = new ArrayList(accessgetInstancedelegatecp.write(list4, 10));
                    while (r2.hasNext()) {
                        arrayList.add(new getDrawFilter(drawargb.address, drawargb.lat, drawargb.f9long));
                    }
                    arrayList2 = new ArrayList();
                    while (r7.hasNext()) {
                        int i11 = RatingCompat + 109;
                        write = i11 % Fields.SpotShadowColor;
                        int i12 = i11 % 2;
                        getdrawfilter = (getDrawFilter) obj6;
                        getLineForVerticalUnbounded getlineforverticalunbounded2 = getlineforvertical.read;
                        getdrawfilter2.getClass();
                        getdrawfilter.getClass();
                        getMaximumBitmapHeight getmaximumbitmapheight4 = getmaximumbitmapheight2;
                        if (TuplesKt.distance(Point.fromLngLat(getdrawfilter2.read, getdrawfilter2.serializer), Point.fromLngLat(getdrawfilter.read, getdrawfilter.serializer), "meters") <= 10.0d) {
                            int i13 = write + 123;
                            RatingCompat = i13 % Fields.SpotShadowColor;
                            int i14 = i13 % 2;
                        } else {
                            arrayList2.add(obj6);
                        }
                        getmaximumbitmapheight2 = getmaximumbitmapheight4;
                    }
                    getmaximumbitmapheight = getmaximumbitmapheight2;
                    obj2 = arrayList2;
                } else {
                    List<drawARGB> list5 = list;
                    arrayList3 = new ArrayList(accessgetInstancedelegatecp.write(list5, 10));
                    while (r2.hasNext()) {
                        arrayList3.add(new getDrawFilter(drawargb2.address, drawargb2.lat, drawargb2.f9long));
                    }
                    obj3 = arrayList3;
                }
                String str3 = getmaximumbitmapheight.MediaSessionCompatQueueItem;
                String str4 = getmaximumbitmapheight.IconCompatParcelizer;
                setDrawFilter setdrawfilter = new setDrawFilter(getmaximumbitmapheight.RemoteActionCompatParcelizer, drawtextonpath2.write, false, drawtextonpath2.RatingCompat);
                if (getdrawfilter2 != null) {
                    i = RatingCompat + 9;
                    write = i % Fields.SpotShadowColor;
                    if (i % 2 == 0) {
                        boolean z2 = drawtextonpath2.RemoteActionCompatParcelizer;
                        throw null;
                    }
                    if (drawtextonpath2.RemoteActionCompatParcelizer) {
                        setmatrix = withCanvas.IconCompatParcelizer;
                    } else {
                        int i15 = RatingCompat + 47;
                        write = i15 % Fields.SpotShadowColor;
                        int i16 = i15 % 2;
                        double d = getdrawfilter2.serializer;
                        double d2 = getdrawfilter2.read;
                        str = getdrawfilter2.IconCompatParcelizer;
                        if (str == null) {
                            str = "";
                        }
                        setmatrix = new setMatrix(str, d, d2);
                    }
                } else {
                    setmatrix = withCanvas.IconCompatParcelizer;
                }
                return new isOpaque(str3, str4, setdrawfilter, setmatrix, getmaximumbitmapheight.read, getmaximumbitmapheight.write, getmaximumbitmapheight.serializer, removeNodeAtDepth.RemoteActionCompatParcelizer((Iterable) obj2), removeNodeAtDepth.RemoteActionCompatParcelizer(getmaximumbitmapheight.MediaDescriptionCompat));
            }
            obj3 = instance_delegatelambda0.write;
            getmaximumbitmapheight = getmaximumbitmapheight2;
            obj2 = obj3;
            String str5 = getmaximumbitmapheight.MediaSessionCompatQueueItem;
            String str6 = getmaximumbitmapheight.IconCompatParcelizer;
            setDrawFilter setdrawfilter2 = new setDrawFilter(getmaximumbitmapheight.RemoteActionCompatParcelizer, drawtextonpath2.write, false, drawtextonpath2.RatingCompat);
            if (getdrawfilter2 != null) {
                i = RatingCompat + 9;
                write = i % Fields.SpotShadowColor;
                if (i % 2 == 0) {
                    boolean z3 = drawtextonpath2.RemoteActionCompatParcelizer;
                    throw null;
                }
                if (drawtextonpath2.RemoteActionCompatParcelizer) {
                    int i17 = RatingCompat + 47;
                    write = i17 % Fields.SpotShadowColor;
                    int i18 = i17 % 2;
                    double d3 = getdrawfilter2.serializer;
                    double d4 = getdrawfilter2.read;
                    str = getdrawfilter2.IconCompatParcelizer;
                    if (str == null) {
                        str = "";
                    }
                    setmatrix = new setMatrix(str, d3, d4);
                } else {
                    setmatrix = withCanvas.IconCompatParcelizer;
                }
            } else {
                setmatrix = withCanvas.IconCompatParcelizer;
            }
            return new isOpaque(str5, str6, setdrawfilter2, setmatrix, getmaximumbitmapheight.read, getmaximumbitmapheight.write, getmaximumbitmapheight.serializer, removeNodeAtDepth.RemoteActionCompatParcelizer((Iterable) obj2), removeNodeAtDepth.RemoteActionCompatParcelizer(getmaximumbitmapheight.MediaDescriptionCompat));
        }
        if (i4 == 2) {
            drawLine drawline2 = (drawLine) this.IconCompatParcelizer;
            g6 g6Var = (g6) this.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (drawline2 instanceof drawTextOnPath) {
                MutableStateFlow mutableStateFlow = ((getEndOffsetForRectWithinRun) obj5).write;
                do {
                    obj4 = mutableStateFlow.read();
                    getbottompaddingui_textannotations = (getBottomPaddingui_textannotations) obj4;
                    drawtextonpath = (drawTextOnPath) drawline2;
                    str2 = drawtextonpath.read;
                } while (!mutableStateFlow.RemoteActionCompatParcelizer(obj4, getbottompaddingui_textannotations != null ? getBottomPaddingui_textannotations.serializer(getbottompaddingui_textannotations, str2, false, drawtextonpath.MediaDescriptionCompat, (g6Var.read - g6Var.write) / 2, 2) : new getBottomPaddingui_textannotations(str2, (g6Var.read - g6Var.write) / 2, false, drawtextonpath.MediaDescriptionCompat)));
            }
            return createFromParcel.INSTANCE;
        }
        if (i4 == 3) {
            copyYTHSh70default copyythsh70default = (copyYTHSh70default) this.IconCompatParcelizer;
            beginBatchEdit beginbatchedit = (beginBatchEdit) this.RemoteActionCompatParcelizer;
            CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
            ExtrasKt.RemoteActionCompatParcelizer(obj);
            if (copyythsh70default instanceof getSingleLine) {
                return new subtractExactOrElse(copyythsh70default);
            }
            if (beginbatchedit instanceof NullableInputConnectionWrapperApi21) {
                return new subtractExactOrElse(copyythsh70default);
            }
            if (beginbatchedit instanceof getAmount) {
                return new MathUtilsKt(copyythsh70default, false);
            }
            if (!(beginbatchedit instanceof NullableInputConnectionWrapper)) {
                if (!(beginbatchedit instanceof disposeDelegate)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                    return null;
                }
                if (!(((copyYTHSh70default) ((CrowdSourcingFloatingImageButtonUiModelImpl) obj5).r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4.read()) instanceof getHintLocales)) {
                    return new subtractExactOrElse(copyythsh70default);
                }
                if (copyythsh70default instanceof copyuxg59PA) {
                    return new MathUtilsKt(copyythsh70default, true);
                }
            }
            return addExactOrElse.serializer;
        }
        originalToTransformed originaltotransformed = (originalToTransformed) this.IconCompatParcelizer;
        OffsetMappingCompanion offsetMappingCompanion = (OffsetMappingCompanion) this.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
        ExtrasKt.RemoteActionCompatParcelizer(obj);
        Vw$Vw vw$Vw = ((notifyFocusedRect) obj5).MediaSessionCompatToken;
        setTransactionSuccessful settransactionsuccessful = (setTransactionSuccessful) vw$Vw.IconCompatParcelizer;
        offsetMappingCompanion.getClass();
        if (originaltotransformed != null) {
            r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk = originaltotransformed.write;
            ArrayList arrayList4 = new ArrayList(accessgetInstancedelegatecp.write(r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk, 10));
            Iterator it = r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdk.iterator();
            for (boolean z4 = true; !(it.hasNext() ^ z4); z4 = true) {
                getIdentity getidentity = (getIdentity) it.next();
                BrazeExternalSyntheticLambda28 brazeExternalSyntheticLambda28 = (BrazeExternalSyntheticLambda28) vw$Vw.serializer;
                performHandwritingGesture performhandwritinggesture = (performHandwritingGesture) offsetMappingCompanion.serializer.get(getidentity.RemoteActionCompatParcelizer);
                String str7 = getidentity.RemoteActionCompatParcelizer;
                String str8 = getidentity.RatingCompat;
                boolean z5 = getidentity.MediaBrowserCompatMediaItem;
                r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer2 = removeNodeAtDepth.RemoteActionCompatParcelizer(getidentity.MediaMetadataCompat);
                String str9 = getidentity.serializer;
                String str10 = getidentity.IconCompatParcelizer;
                PartialGapBuffer partialGapBuffer2 = getidentity.read;
                if (partialGapBuffer2 != null) {
                    PartialGapBuffer partialGapBufferSerializer2 = Vw$Vw.serializer(partialGapBuffer2, performhandwritinggesture != null ? Boolean.valueOf(performhandwritinggesture.read) : null);
                    if (partialGapBufferSerializer2 != null) {
                        int i19 = RatingCompat + 107;
                        write = i19 % Fields.SpotShadowColor;
                        int i20 = i19 % 2;
                        getimmRemoteActionCompatParcelizer = brazeExternalSyntheticLambda28.RemoteActionCompatParcelizer(partialGapBufferSerializer2);
                    }
                    partialGapBuffer = getidentity.write;
                    if (partialGapBuffer == null) {
                        getimmRemoteActionCompatParcelizer2 = null;
                    } else {
                        if (performhandwritinggesture != null) {
                            i2 = write + 51;
                            RatingCompat = i2 % Fields.SpotShadowColor;
                            if (i2 % 2 != 0) {
                                Boolean.valueOf(performhandwritinggesture.IconCompatParcelizer);
                                Object obj7 = null;
                                obj7.hashCode();
                                throw null;
                            }
                            boolValueOf = Boolean.valueOf(performhandwritinggesture.IconCompatParcelizer);
                        } else {
                            boolValueOf = null;
                        }
                        partialGapBufferSerializer = Vw$Vw.serializer(partialGapBuffer, boolValueOf);
                        if (partialGapBufferSerializer != null) {
                            getimmRemoteActionCompatParcelizer2 = brazeExternalSyntheticLambda28.RemoteActionCompatParcelizer(partialGapBufferSerializer);
                        } else {
                            getimmRemoteActionCompatParcelizer2 = null;
                        }
                    }
                    InputMethodManager inputMethodManager = new InputMethodManager(str7, str8, z5, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer2, str9, str10, getimmRemoteActionCompatParcelizer, getimmRemoteActionCompatParcelizer2);
                    if (getimmRemoteActionCompatParcelizer == null && getimmRemoteActionCompatParcelizer.RemoteActionCompatParcelizer && getimmRemoteActionCompatParcelizer2 != null && getimmRemoteActionCompatParcelizer2.RemoteActionCompatParcelizer) {
                        r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.write("Crowdsourcing Image shouldn't have both votes pressed", Timber.RemoteActionCompatParcelizer);
                    }
                    arrayList4.add(inputMethodManager);
                    vw$Vw = vw$Vw;
                    it = it;
                } else {
                    vw$Vw = vw$Vw;
                }
                getimmRemoteActionCompatParcelizer = null;
                partialGapBuffer = getidentity.write;
                if (partialGapBuffer == null) {
                    getimmRemoteActionCompatParcelizer2 = null;
                } else {
                    if (performhandwritinggesture != null) {
                        i2 = write + 51;
                        RatingCompat = i2 % Fields.SpotShadowColor;
                        if (i2 % 2 != 0) {
                            Boolean.valueOf(performhandwritinggesture.IconCompatParcelizer);
                            Object obj8 = null;
                            obj8.hashCode();
                            throw null;
                        }
                        boolValueOf = Boolean.valueOf(performhandwritinggesture.IconCompatParcelizer);
                    } else {
                        boolValueOf = null;
                    }
                    partialGapBufferSerializer = Vw$Vw.serializer(partialGapBuffer, boolValueOf);
                    if (partialGapBufferSerializer != null) {
                        getimmRemoteActionCompatParcelizer2 = brazeExternalSyntheticLambda28.RemoteActionCompatParcelizer(partialGapBufferSerializer);
                    } else {
                        getimmRemoteActionCompatParcelizer2 = null;
                    }
                }
                InputMethodManager inputMethodManager2 = new InputMethodManager(str7, str8, z5, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer2, str9, str10, getimmRemoteActionCompatParcelizer, getimmRemoteActionCompatParcelizer2);
                if (getimmRemoteActionCompatParcelizer == null) {
                }
                arrayList4.add(inputMethodManager2);
                vw$Vw = vw$Vw;
                it = it;
            }
            r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer = removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList4);
        } else {
            r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer = null;
        }
        if (r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer == null || r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer.isEmpty()) {
            return restartInput.RemoteActionCompatParcelizer;
        }
        String str11 = offsetMappingCompanion.RatingCompat;
        if (hideCurrentlyDisplayingInAppMessage.serializer((CharSequence) str11)) {
            str11 = ((InputMethodManager) onContentCardDismissed.read((List) r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer)).RemoteActionCompatParcelizer;
        }
        String str12 = str11;
        String str13 = originaltotransformed.serializer;
        String str14 = originaltotransformed.RemoteActionCompatParcelizer;
        String str15 = originaltotransformed.read;
        boolean z6 = originaltotransformed.MediaSessionCompatQueueItem;
        String str16 = originaltotransformed.MediaDescriptionCompat;
        boolean z7 = originaltotransformed.IconCompatParcelizer;
        String strIconCompatParcelizer = settransactionsuccessful.IconCompatParcelizer(R.string.df_crowdsourcing_gallery_btn_add_photo);
        showSoftInput showsoftinput = offsetMappingCompanion.write;
        boolean z8 = offsetMappingCompanion.IconCompatParcelizer;
        PartialGapBufferCompanion partialGapBufferCompanion = originaltotransformed.MediaBrowserCompatMediaItem;
        NullableInputConnectionWrapperApi34 nullableInputConnectionWrapperApi34 = offsetMappingCompanion.RemoteActionCompatParcelizer;
        if (partialGapBufferCompanion != null) {
            int i21 = RatingCompat + 45;
            write = i21 % Fields.SpotShadowColor;
            int i22 = i21 % 2;
            if (nullableInputConnectionWrapperApi34 == null) {
                z = z8;
                hidesoftinput = null;
            } else {
                String str17 = partialGapBufferCompanion.read;
                String str18 = partialGapBufferCompanion.IconCompatParcelizer;
                String str19 = partialGapBufferCompanion.RemoteActionCompatParcelizer;
                String strIconCompatParcelizer2 = settransactionsuccessful.IconCompatParcelizer(R.string.cancel);
                List list6 = partialGapBufferCompanion.write;
                ArrayList arrayList5 = new ArrayList(accessgetInstancedelegatecp.write(list6, 10));
                Iterator it2 = list6.iterator();
                while (it2.hasNext()) {
                    OffsetMapping offsetMapping = (OffsetMapping) it2.next();
                    arrayList5.add(new InputMethodManagerImpl(offsetMapping.serializer, offsetMapping.read));
                    it2 = it2;
                    z8 = z8;
                }
                z = z8;
                r8lambda9QlT_ra9FwUEV5vl9YtC6BGxtDk r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer3 = removeNodeAtDepth.RemoteActionCompatParcelizer(arrayList5);
                transformedToOriginal transformedtooriginal = partialGapBufferCompanion.serializer;
                hidesoftinput = new hideSoftInput(str17, str18, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer3, transformedtooriginal != null ? new InputState_androidKt(transformedtooriginal.write, transformedtooriginal.read) : null, str19, strIconCompatParcelizer2, nullableInputConnectionWrapperApi34.serializer, nullableInputConnectionWrapperApi34.RemoteActionCompatParcelizer);
            }
        } else {
            z = z8;
            hidesoftinput = null;
        }
        return new updateExtractedText(str12, r8lambda9qlt_ra9fwuev5vl9ytc6bgxtdkRemoteActionCompatParcelizer, str13, str14, str15, z6, str16, z7, strIconCompatParcelizer, showsoftinput, z, hidesoftinput, offsetMappingCompanion.read);
    }
}
