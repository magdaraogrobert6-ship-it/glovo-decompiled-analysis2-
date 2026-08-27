package o;

import android.util.Base64;
import bo.app.d$$ExternalSyntheticOutline0;
import com.braze.location.GooglePlayLocationUtils$$ExternalSyntheticLambda18;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.gson.Gson$$ExternalSyntheticBUOutline0;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.roadrunner.home.CreateHomeScope;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes2.dex */
public final class didInsert {
    public static final CreateHomeScope IconCompatParcelizer;

    static {
        detachAndRemoveNode detachandremovenode = new detachAndRemoveNode();
        remeasureBRTryo0 remeasurebrtryo0 = remeasureBRTryo0.MediaBrowserCompatMediaItem;
        detachandremovenode.serializer(traceMeasureLayout.class, remeasurebrtryo0);
        detachandremovenode.serializer(ensureSubtreeLookaheadReplaced.class, remeasurebrtryo0);
        LookaheadPassDelegatelayoutModifierBlock1 lookaheadPassDelegatelayoutModifierBlock1 = LookaheadPassDelegatelayoutModifierBlock1.MediaSessionCompatQueueItem;
        detachandremovenode.serializer(trackMeasurementByParent.class, lookaheadPassDelegatelayoutModifierBlock1);
        detachandremovenode.serializer(performMeasureAndLayout.class, lookaheadPassDelegatelayoutModifierBlock1);
        LookaheadPassDelegatePlacedState lookaheadPassDelegatePlacedState = LookaheadPassDelegatePlacedState.MediaBrowserCompatMediaItem;
        detachandremovenode.serializer(getLookaheadPassDelegate.class, lookaheadPassDelegatePlacedState);
        detachandremovenode.serializer(remeasureIfNeeded.class, lookaheadPassDelegatePlacedState);
        LookaheadPassDelegateWhenMappings lookaheadPassDelegateWhenMappings = LookaheadPassDelegateWhenMappings.RemoteActionCompatParcelizer;
        detachandremovenode.serializer(BuildersKt.class, lookaheadPassDelegateWhenMappings);
        detachandremovenode.serializer(requestLookaheadRemeasuredefault.class, lookaheadPassDelegateWhenMappings);
        forceMeasureTheSubtreeInternal forcemeasurethesubtreeinternal = forceMeasureTheSubtreeInternal.IconCompatParcelizer;
        detachandremovenode.serializer(isInLookaheadPass.class, forcemeasurethesubtreeinternal);
        detachandremovenode.serializer(MeasureAndLayoutDelegateWhenMappings.class, forcemeasurethesubtreeinternal);
        getCanAffectParentInLookahead getcanaffectparentinlookahead = getCanAffectParentInLookahead.serializer;
        detachandremovenode.serializer(MergedViewAdapter.class, getcanaffectparentinlookahead);
        detachandremovenode.serializer(setDuringMeasureLayoutui.class, getcanaffectparentinlookahead);
        setPlaceOrderui setplaceorderui = setPlaceOrderui.read;
        detachandremovenode.serializer(placeOuterCoordinatorMLgxB_4.class, setplaceorderui);
        detachandremovenode.serializer(requestLookaheadRelayoutdefault.class, setplaceorderui);
        doRemeasuresdFAvZA doremeasuresdfavza = doRemeasuresdFAvZA.serializer;
        detachandremovenode.serializer(getLastPositionnOccacui.class, doremeasuresdfavza);
        detachandremovenode.serializer(remeasureIfNeededdefault.class, doremeasuresdfavza);
        LookaheadPassDelegateperformMeasureBlock1 lookaheadPassDelegateperformMeasureBlock1 = LookaheadPassDelegateperformMeasureBlock1.RatingCompat;
        detachandremovenode.serializer(getPreviousPlaceOrderui.class, lookaheadPassDelegateperformMeasureBlock1);
        detachandremovenode.serializer(dispatchOnPositionedCallbacks.class, lookaheadPassDelegateperformMeasureBlock1);
        LookaheadPassDelegatelayoutChildrenBlock1 lookaheadPassDelegatelayoutChildrenBlock1 = LookaheadPassDelegatelayoutChildrenBlock1.IconCompatParcelizer;
        detachandremovenode.serializer(getZIndexui.class, lookaheadPassDelegatelayoutChildrenBlock1);
        detachandremovenode.serializer(requestRemeasuredefault.class, lookaheadPassDelegatelayoutChildrenBlock1);
        accessremeasureAndRelayoutIfNeeded accessremeasureandrelayoutifneeded = accessremeasureAndRelayoutIfNeeded.RemoteActionCompatParcelizer;
        detachandremovenode.serializer(requestLayoutIfCoordinatesAreUsedAndNotifyChildren.class, accessremeasureandrelayoutifneeded);
        detachandremovenode.serializer(getHasPendingMeasureOrLayout.class, accessremeasureandrelayoutifneeded);
        accessgetRelayoutNodesp accessgetrelayoutnodesp = accessgetRelayoutNodesp.write;
        detachandremovenode.serializer(setDuringAlignmentLinesQueryui.class, accessgetrelayoutnodesp);
        detachandremovenode.serializer(getHasPendingOnPositionedCallbacks.class, accessgetrelayoutnodesp);
        LookaheadPassDelegatelayoutChildrenBlock14 lookaheadPassDelegatelayoutChildrenBlock14 = LookaheadPassDelegatelayoutChildrenBlock14.RemoteActionCompatParcelizer;
        detachandremovenode.serializer(getPlacedOnce.class, lookaheadPassDelegatelayoutChildrenBlock14);
        detachandremovenode.serializer(forceMeasureTheSubtree.class, lookaheadPassDelegatelayoutChildrenBlock14);
        setChildDelegatesDirtyui setchilddelegatesdirtyui = setChildDelegatesDirtyui.IconCompatParcelizer;
        detachandremovenode.serializer(MeasurePassDelegate.class, setchilddelegatesdirtyui);
        detachandremovenode.serializer(getLookaheadRemeasureCanAffectParentSize.class, setchilddelegatesdirtyui);
        replace replaceVar = replace.IconCompatParcelizer;
        detachandremovenode.serializer(accessgetPlaceOuterCoordinatorLayerp.class, replaceVar);
        detachandremovenode.serializer(measurePending.class, replaceVar);
        accessremeasureIfNeeded accessremeasureifneeded = accessremeasureIfNeeded.read;
        detachandremovenode.serializer(setPlacedui.class, accessremeasureifneeded);
        detachandremovenode.serializer(getDuringMeasureLayoutui.class, accessremeasureifneeded);
        LookaheadPassDelegatelayoutChildrenBlock11 lookaheadPassDelegatelayoutChildrenBlock11 = LookaheadPassDelegatelayoutChildrenBlock11.read;
        detachandremovenode.serializer(markDetachedFromParentLookaheadPassui.class, lookaheadPassDelegatelayoutChildrenBlock11);
        detachandremovenode.serializer(requestRelayoutdefault.class, lookaheadPassDelegatelayoutChildrenBlock11);
        performMeasureBRTryo0ui performmeasurebrtryo0ui = performMeasureBRTryo0ui.IconCompatParcelizer;
        detachandremovenode.serializer(accesssetPerformMeasureConstraintsp.class, performmeasurebrtryo0ui);
        detachandremovenode.serializer(measureAndLayoutdefault.class, performmeasurebrtryo0ui);
        MeasureAndLayoutDelegate measureAndLayoutDelegate = MeasureAndLayoutDelegate.read;
        detachandremovenode.serializer(markLayoutPending.class, measureAndLayoutDelegate);
        detachandremovenode.serializer(getUncaughtExceptionHandlerui.class, measureAndLayoutDelegate);
        LookaheadPassDelegateremeasure12 lookaheadPassDelegateremeasure12 = LookaheadPassDelegateremeasure12.read;
        detachandremovenode.serializer(MeasurePassDelegatelayoutChildrenBlock1.class, lookaheadPassDelegateremeasure12);
        detachandremovenode.serializer(measureAndLayout0kLqBqw.class, lookaheadPassDelegateremeasure12);
        doLookaheadRemeasuresdFAvZA dolookaheadremeasuresdfavza = doLookaheadRemeasuresdFAvZA.write;
        detachandremovenode.serializer(MeasurePassDelegateWhenMappings.class, dolookaheadremeasuresdfavza);
        detachandremovenode.serializer(requestLookaheadRelayout.class, dolookaheadremeasuresdfavza);
        dispatchOnPositionedCallbacksdefault dispatchonpositionedcallbacksdefault = dispatchOnPositionedCallbacksdefault.serializer;
        detachandremovenode.serializer(MeasureScopeWithLayoutNodeKt.class, dispatchonpositionedcallbacksdefault);
        detachandremovenode.serializer(requestRelayout.class, dispatchonpositionedcallbacksdefault);
        drainPostponedMeasureRequests drainpostponedmeasurerequests = drainPostponedMeasureRequests.RemoteActionCompatParcelizer;
        detachandremovenode.serializer(MeasurePassDelegateplaceOuterCoordinatorBlock1.class, drainpostponedmeasurerequests);
        detachandremovenode.serializer(requestLookaheadRemeasure.class, drainpostponedmeasurerequests);
        callOnLayoutCompletedListeners callonlayoutcompletedlisteners = callOnLayoutCompletedListeners.RemoteActionCompatParcelizer;
        detachandremovenode.serializer(getChildrenOfVirtualChildren.class, callonlayoutcompletedlisteners);
        detachandremovenode.serializer(setUncaughtExceptionHandlerui.class, callonlayoutcompletedlisteners);
        setMeasuredByParentui setmeasuredbyparentui = setMeasuredByParentui.RemoteActionCompatParcelizer;
        detachandremovenode.serializer(accessgetPlaceOuterCoordinatorLayerBlockp.class, setmeasuredbyparentui);
        detachandremovenode.serializer(isUsedInMeasureOrLayout.class, setmeasuredbyparentui);
        setPlacedOnceui setplacedonceui = setPlacedOnceui.RemoteActionCompatParcelizer;
        detachandremovenode.serializer(accesssetMeasurePendingp.class, setplacedonceui);
        detachandremovenode.serializer(remeasureAndRelayoutIfNeededdefault.class, setplacedonceui);
        detachandremovenode.RatingCompat = true;
        IconCompatParcelizer = new CreateHomeScope(detachandremovenode);
    }

    public static List IconCompatParcelizer(android.util.JsonReader jsonReader, MeasureScopeWithLayoutNodeKtWhenMappings measureScopeWithLayoutNodeKtWhenMappings) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(measureScopeWithLayoutNodeKtWhenMappings.parse(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    public static getLookaheadRemeasureCanAffectParentSize IconCompatParcelizer(android.util.JsonReader jsonReader) throws IOException {
        getMeasuredByPlacedParent getmeasuredbyplacedparent = new getMeasuredByPlacedParent();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "buildIdMappingForArch":
                    getmeasuredbyplacedparent.RemoteActionCompatParcelizer(IconCompatParcelizer(jsonReader, new GooglePlayLocationUtils$$ExternalSyntheticLambda18(23)));
                    break;
                case "pid":
                    getmeasuredbyplacedparent.write(jsonReader.nextInt());
                    break;
                case "pss":
                    getmeasuredbyplacedparent.RemoteActionCompatParcelizer(jsonReader.nextLong());
                    break;
                case "rss":
                    getmeasuredbyplacedparent.IconCompatParcelizer(jsonReader.nextLong());
                    break;
                case "timestamp":
                    getmeasuredbyplacedparent.write(jsonReader.nextLong());
                    break;
                case "processName":
                    getmeasuredbyplacedparent.write(jsonReader.nextString());
                    break;
                case "reasonCode":
                    getmeasuredbyplacedparent.RemoteActionCompatParcelizer(jsonReader.nextInt());
                    break;
                case "traceFile":
                    getmeasuredbyplacedparent.RemoteActionCompatParcelizer(jsonReader.nextString());
                    break;
                case "importance":
                    getmeasuredbyplacedparent.read(jsonReader.nextInt());
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return getmeasuredbyplacedparent.read();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    public static getUncaughtExceptionHandlerui MediaSessionCompatQueueItem(android.util.JsonReader jsonReader) throws IOException {
        byte b;
        measureAndLayout measureandlayout = new measureAndLayout();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "pid":
                    b = 0;
                    break;
                case "processName":
                    b = 1;
                    break;
                case "defaultProcess":
                    b = 2;
                    break;
                case "importance":
                    b = 3;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                measureandlayout.write = jsonReader.nextInt();
                measureandlayout.read = (byte) (measureandlayout.read | 1);
            } else if (b == 1) {
                String strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null processName");
                    return null;
                }
                measureandlayout.IconCompatParcelizer = strNextString;
            } else if (b == 2) {
                measureandlayout.RemoteActionCompatParcelizer = jsonReader.nextBoolean();
                measureandlayout.read = (byte) (measureandlayout.read | 4);
            } else if (b != 3) {
                jsonReader.skipValue();
            } else {
                measureandlayout.serializer = jsonReader.nextInt();
                measureandlayout.read = (byte) (measureandlayout.read | 2);
            }
        }
        jsonReader.endObject();
        return measureandlayout.read();
    }

    public static ensureSubtreeLookaheadReplaced serializer(String str) throws IOException {
        try {
            android.util.JsonReader jsonReader = new android.util.JsonReader(new StringReader(str));
            try {
                ensureSubtreeLookaheadReplaced ensuresubtreelookaheadreplacedMediaMetadataCompat = MediaMetadataCompat(jsonReader);
                jsonReader.close();
                return ensuresubtreelookaheadreplacedMediaMetadataCompat;
            } catch (Throwable th) {
                try {
                    jsonReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    public static getHasPendingOnPositionedCallbacks serializer(android.util.JsonReader jsonReader) throws IOException {
        byte b;
        getMeasureIteration getmeasureiteration = new getMeasureIteration();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "offset":
                    b = 0;
                    break;
                case "symbol":
                    b = 1;
                    break;
                case "pc":
                    b = 2;
                    break;
                case "file":
                    b = 3;
                    break;
                case "importance":
                    b = 4;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                getmeasureiteration.write = jsonReader.nextLong();
                getmeasureiteration.read = (byte) (getmeasureiteration.read | 2);
            } else if (b == 1) {
                String strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null symbol");
                    return null;
                }
                getmeasureiteration.MediaMetadataCompat = strNextString;
            } else if (b == 2) {
                getmeasureiteration.IconCompatParcelizer = jsonReader.nextLong();
                getmeasureiteration.read = (byte) (getmeasureiteration.read | 1);
            } else if (b == 3) {
                getmeasureiteration.RemoteActionCompatParcelizer = jsonReader.nextString();
            } else if (b != 4) {
                jsonReader.skipValue();
            } else {
                getmeasureiteration.serializer = jsonReader.nextInt();
                getmeasureiteration.read = (byte) (getmeasureiteration.read | 4);
            }
        }
        jsonReader.endObject();
        return getmeasureiteration.serializer();
    }

    public static ensureSubtreeLookaheadReplaced MediaMetadataCompat(android.util.JsonReader jsonReader) throws IOException {
        byte b;
        byte b2;
        Charset charset = traceMeasureLayout.PlaybackStateCompat;
        getCanAffectPlacedParent getcanaffectplacedparent = new getCanAffectPlacedParent();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "ndkPayload":
                    onlyRemeasureIfPending onlyremeasureifpending = new onlyRemeasureIfPending();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName2 = jsonReader.nextName();
                        strNextName2.getClass();
                        if (strNextName2.equals("files")) {
                            onlyremeasureifpending.serializer(IconCompatParcelizer(jsonReader, new GooglePlayLocationUtils$$ExternalSyntheticLambda18(24)));
                        } else if (strNextName2.equals("orgId")) {
                            onlyremeasureifpending.serializer(jsonReader.nextString());
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    getcanaffectplacedparent.MediaDescriptionCompat = onlyremeasureifpending.RemoteActionCompatParcelizer();
                    continue;
                    break;
                case "sdkVersion":
                    String strNextString = jsonReader.nextString();
                    if (strNextString == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null sdkVersion");
                        return null;
                    }
                    getcanaffectplacedparent.PlaybackStateCompatCustomAction = strNextString;
                    break;
                    break;
                case "appQualitySessionId":
                    getcanaffectplacedparent.RemoteActionCompatParcelizer = jsonReader.nextString();
                    break;
                case "appExitInfo":
                    getcanaffectplacedparent.read = IconCompatParcelizer(jsonReader);
                    break;
                case "buildVersion":
                    String strNextString2 = jsonReader.nextString();
                    if (strNextString2 == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null buildVersion");
                        return null;
                    }
                    getcanaffectplacedparent.serializer = strNextString2;
                    break;
                    break;
                case "firebaseAuthenticationToken":
                    getcanaffectplacedparent.write = jsonReader.nextString();
                    break;
                case "gmpAppId":
                    String strNextString3 = jsonReader.nextString();
                    if (strNextString3 == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null gmpAppId");
                        return null;
                    }
                    getcanaffectplacedparent.MediaMetadataCompat = strNextString3;
                    break;
                    break;
                case "installationUuid":
                    String strNextString4 = jsonReader.nextString();
                    if (strNextString4 == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null installationUuid");
                        return null;
                    }
                    getcanaffectplacedparent.MediaSessionCompatQueueItem = strNextString4;
                    break;
                    break;
                case "firebaseInstallationId":
                    getcanaffectplacedparent.RatingCompat = jsonReader.nextString();
                    break;
                case "platform":
                    getcanaffectplacedparent.MediaBrowserCompatMediaItem = jsonReader.nextInt();
                    getcanaffectplacedparent.MediaSessionCompatResultReceiverWrapper = (byte) (getcanaffectplacedparent.MediaSessionCompatResultReceiverWrapper | 1);
                    break;
                case "displayVersion":
                    String strNextString5 = jsonReader.nextString();
                    if (strNextString5 == null) {
                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null displayVersion");
                        return null;
                    }
                    getcanaffectplacedparent.IconCompatParcelizer = strNextString5;
                    break;
                    break;
                case "session":
                    remeasureAndRelayoutIfNeeded remeasureandrelayoutifneeded = new remeasureAndRelayoutIfNeeded();
                    remeasureandrelayoutifneeded.RemoteActionCompatParcelizer = false;
                    remeasureandrelayoutifneeded.PlaybackStateCompatCustomAction = (byte) (remeasureandrelayoutifneeded.PlaybackStateCompatCustomAction | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3) {
                            case "startedAt":
                                remeasureandrelayoutifneeded.MediaSessionCompatToken = jsonReader.nextLong();
                                remeasureandrelayoutifneeded.PlaybackStateCompatCustomAction = (byte) (remeasureandrelayoutifneeded.PlaybackStateCompatCustomAction | 1);
                                break;
                            case "appQualitySessionId":
                                remeasureandrelayoutifneeded.read = jsonReader.nextString();
                                break;
                            case "identifier":
                                remeasureandrelayoutifneeded.MediaDescriptionCompat = new String(Base64.decode(jsonReader.nextString(), 2), traceMeasureLayout.PlaybackStateCompat);
                                break;
                            case "endedAt":
                                remeasureandrelayoutifneeded.write = Long.valueOf(jsonReader.nextLong());
                                break;
                            case "device":
                                remeasureLookaheadRootsInSubtree remeasurelookaheadrootsinsubtree = new remeasureLookaheadRootsInSubtree();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "simulator":
                                            remeasurelookaheadrootsinsubtree.RatingCompat = jsonReader.nextBoolean();
                                            remeasurelookaheadrootsinsubtree.MediaSessionCompatQueueItem = (byte) (remeasurelookaheadrootsinsubtree.MediaSessionCompatQueueItem | 16);
                                            break;
                                        case "manufacturer":
                                            String strNextString6 = jsonReader.nextString();
                                            if (strNextString6 == null) {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null manufacturer");
                                                return null;
                                            }
                                            remeasurelookaheadrootsinsubtree.serializer = strNextString6;
                                            break;
                                            break;
                                        case "ram":
                                            remeasurelookaheadrootsinsubtree.MediaDescriptionCompat = jsonReader.nextLong();
                                            remeasurelookaheadrootsinsubtree.MediaSessionCompatQueueItem = (byte) (remeasurelookaheadrootsinsubtree.MediaSessionCompatQueueItem | 4);
                                            break;
                                        case "arch":
                                            remeasurelookaheadrootsinsubtree.read = jsonReader.nextInt();
                                            remeasurelookaheadrootsinsubtree.MediaSessionCompatQueueItem = (byte) (remeasurelookaheadrootsinsubtree.MediaSessionCompatQueueItem | 1);
                                            break;
                                        case "diskSpace":
                                            remeasurelookaheadrootsinsubtree.write = jsonReader.nextLong();
                                            remeasurelookaheadrootsinsubtree.MediaSessionCompatQueueItem = (byte) (remeasurelookaheadrootsinsubtree.MediaSessionCompatQueueItem | 8);
                                            break;
                                        case "cores":
                                            remeasurelookaheadrootsinsubtree.RemoteActionCompatParcelizer = jsonReader.nextInt();
                                            remeasurelookaheadrootsinsubtree.MediaSessionCompatQueueItem = (byte) (remeasurelookaheadrootsinsubtree.MediaSessionCompatQueueItem | 2);
                                            break;
                                        case "model":
                                            String strNextString7 = jsonReader.nextString();
                                            if (strNextString7 == null) {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null model");
                                                return null;
                                            }
                                            remeasurelookaheadrootsinsubtree.IconCompatParcelizer = strNextString7;
                                            break;
                                            break;
                                        case "state":
                                            remeasurelookaheadrootsinsubtree.MediaMetadataCompat = jsonReader.nextInt();
                                            remeasurelookaheadrootsinsubtree.MediaSessionCompatQueueItem = (byte) (remeasurelookaheadrootsinsubtree.MediaSessionCompatQueueItem | 32);
                                            break;
                                        case "modelClass":
                                            String strNextString8 = jsonReader.nextString();
                                            if (strNextString8 == null) {
                                                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null modelClass");
                                                return null;
                                            }
                                            remeasurelookaheadrootsinsubtree.MediaBrowserCompatMediaItem = strNextString8;
                                            break;
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                remeasureandrelayoutifneeded.IconCompatParcelizer = remeasurelookaheadrootsinsubtree.read();
                                break;
                            case "events":
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(write(jsonReader));
                                }
                                jsonReader.endArray();
                                remeasureandrelayoutifneeded.MediaMetadataCompat = Collections.unmodifiableList(arrayList);
                                break;
                            case "os":
                                updateRootConstraintsBRTryo0 updaterootconstraintsbrtryo0 = new updateRootConstraintsBRTryo0();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String strNextName5 = jsonReader.nextName();
                                    strNextName5.getClass();
                                    switch (strNextName5) {
                                        case "buildVersion":
                                            b = 0;
                                            break;
                                        case "jailbroken":
                                            b = 1;
                                            break;
                                        case "version":
                                            b = 2;
                                            break;
                                        case "platform":
                                            b = 3;
                                            break;
                                        default:
                                            b = -1;
                                            break;
                                    }
                                    if (b == 0) {
                                        String strNextString9 = jsonReader.nextString();
                                        if (strNextString9 == null) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null buildVersion");
                                            return null;
                                        }
                                        updaterootconstraintsbrtryo0.serializer = strNextString9;
                                    } else if (b == 1) {
                                        updaterootconstraintsbrtryo0.write = jsonReader.nextBoolean();
                                        updaterootconstraintsbrtryo0.IconCompatParcelizer = (byte) (updaterootconstraintsbrtryo0.IconCompatParcelizer | 2);
                                    } else if (b == 2) {
                                        String strNextString10 = jsonReader.nextString();
                                        if (strNextString10 == null) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null version");
                                            return null;
                                        }
                                        updaterootconstraintsbrtryo0.read = strNextString10;
                                    } else if (b != 3) {
                                        jsonReader.skipValue();
                                    } else {
                                        updaterootconstraintsbrtryo0.RemoteActionCompatParcelizer = jsonReader.nextInt();
                                        updaterootconstraintsbrtryo0.IconCompatParcelizer = (byte) (updaterootconstraintsbrtryo0.IconCompatParcelizer | 1);
                                    }
                                }
                                jsonReader.endObject();
                                remeasureandrelayoutifneeded.MediaSessionCompatQueueItem = updaterootconstraintsbrtryo0.read();
                                break;
                            case "app":
                                jsonReader.beginObject();
                                String strNextString11 = null;
                                String strNextString12 = null;
                                String strNextString13 = null;
                                String strNextString14 = null;
                                String strNextString15 = null;
                                String strNextString16 = null;
                                while (jsonReader.hasNext()) {
                                    String strNextName6 = jsonReader.nextName();
                                    strNextName6.getClass();
                                    switch (strNextName6) {
                                        case "identifier":
                                            b2 = 0;
                                            break;
                                        case "developmentPlatform":
                                            b2 = 1;
                                            break;
                                        case "developmentPlatformVersion":
                                            b2 = 2;
                                            break;
                                        case "version":
                                            b2 = 3;
                                            break;
                                        case "installationUuid":
                                            b2 = 4;
                                            break;
                                        case "displayVersion":
                                            b2 = 5;
                                            break;
                                        default:
                                            b2 = -1;
                                            break;
                                    }
                                    if (b2 == 0) {
                                        strNextString11 = jsonReader.nextString();
                                        if (strNextString11 == null) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null identifier");
                                            return null;
                                        }
                                    } else if (b2 == 1) {
                                        strNextString15 = jsonReader.nextString();
                                    } else if (b2 == 2) {
                                        strNextString16 = jsonReader.nextString();
                                    } else if (b2 == 3) {
                                        strNextString12 = jsonReader.nextString();
                                        if (strNextString12 == null) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null version");
                                            return null;
                                        }
                                    } else if (b2 == 4) {
                                        strNextString14 = jsonReader.nextString();
                                    } else if (b2 != 5) {
                                        jsonReader.skipValue();
                                    } else {
                                        strNextString13 = jsonReader.nextString();
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString11 != null && strNextString12 != null) {
                                    remeasureandrelayoutifneeded.serializer = new remeasureIfNeeded(strNextString11, strNextString12, strNextString13, strNextString14, strNextString15, strNextString16);
                                    break;
                                } else {
                                    StringBuilder sb = new StringBuilder();
                                    if (strNextString11 == null) {
                                        sb.append(" identifier");
                                    }
                                    if (strNextString12 == null) {
                                        sb.append(" version");
                                    }
                                    ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
                                    return null;
                                }
                                break;
                            case "user":
                                jsonReader.beginObject();
                                String strNextString17 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        strNextString17 = jsonReader.nextString();
                                        if (strNextString17 == null) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null identifier");
                                            return null;
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (strNextString17 == null) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: identifier");
                                    return null;
                                }
                                remeasureandrelayoutifneeded.PlaybackStateCompat = new MeasureAndLayoutDelegateWhenMappings(strNextString17);
                                break;
                                break;
                            case "generator":
                                String strNextString18 = jsonReader.nextString();
                                if (strNextString18 == null) {
                                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null generator");
                                    return null;
                                }
                                remeasureandrelayoutifneeded.MediaBrowserCompatMediaItem = strNextString18;
                                break;
                                break;
                            case "crashed":
                                remeasureandrelayoutifneeded.RemoteActionCompatParcelizer = jsonReader.nextBoolean();
                                remeasureandrelayoutifneeded.PlaybackStateCompatCustomAction = (byte) (remeasureandrelayoutifneeded.PlaybackStateCompatCustomAction | 2);
                                break;
                            case "generatorType":
                                remeasureandrelayoutifneeded.RatingCompat = jsonReader.nextInt();
                                remeasureandrelayoutifneeded.PlaybackStateCompatCustomAction = (byte) (remeasureandrelayoutifneeded.PlaybackStateCompatCustomAction | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    getcanaffectplacedparent.ParcelableVolumeInfo = remeasureandrelayoutifneeded.serializer();
                    break;
                default:
                    jsonReader.skipValue();
                    continue;
                    break;
            }
        }
        jsonReader.endObject();
        return getcanaffectplacedparent.read();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:138:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:171:0x025f  */
    /* JADX WARN: Code duplicated, block: B:279:0x0402  */
    /* JADX WARN: Code duplicated, block: B:32:0x0066  */
    /* JADX WARN: Code duplicated, block: B:97:0x0142  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r21v5 */
    /* JADX WARN: Type inference failed for: r22v1, types: [o.forceMeasureTheSubtree] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r22v3, types: [o.forceMeasureTheSubtree] */
    /* JADX WARN: Type inference failed for: r22v4 */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r23v1, types: [o.MeasurePassDelegate] */
    /* JADX WARN: Type inference failed for: r23v2, types: [o.getLookaheadRemeasureCanAffectParentSize] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v5 */
    /* JADX WARN: Type inference failed for: r24v1, types: [o.getDuringMeasureLayoutui] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v5 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r25v4 */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static remeasureIfNeededdefault write(android.util.JsonReader jsonReader) throws IOException {
        byte b;
        int i;
        int i2;
        byte b2;
        String strNextString;
        byte b3;
        remeasureOnly remeasureonly = new remeasureOnly();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            int i3 = 5;
            int i4 = 4;
            int i5 = 3;
            int i6 = 2;
            switch (strNextName) {
                case "device":
                    b = 0;
                    break;
                case "rollouts":
                    b = 1;
                    break;
                case "app":
                    b = 2;
                    break;
                case "log":
                    b = 3;
                    break;
                case "type":
                    b = 4;
                    break;
                case "timestamp":
                    b = 5;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                measureOnly measureonly = new measureOnly();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    strNextName2.getClass();
                    switch (strNextName2) {
                        case "batteryLevel":
                            b3 = 0;
                            break;
                        case "batteryVelocity":
                            b3 = 1;
                            break;
                        case "orientation":
                            b3 = 2;
                            break;
                        case "diskUsed":
                            b3 = 3;
                            break;
                        case "ramUsed":
                            b3 = 4;
                            break;
                        case "proximityOn":
                            b3 = 5;
                            break;
                        default:
                            b3 = -1;
                            break;
                    }
                    if (b3 == 0) {
                        measureonly.serializer = Double.valueOf(jsonReader.nextDouble());
                    } else if (b3 == 1) {
                        measureonly.write = jsonReader.nextInt();
                        measureonly.MediaBrowserCompatMediaItem = (byte) (measureonly.MediaBrowserCompatMediaItem | 1);
                    } else if (b3 == 2) {
                        measureonly.RemoteActionCompatParcelizer = jsonReader.nextInt();
                        measureonly.MediaBrowserCompatMediaItem = (byte) (measureonly.MediaBrowserCompatMediaItem | 4);
                    } else if (b3 == 3) {
                        measureonly.IconCompatParcelizer = jsonReader.nextLong();
                        measureonly.MediaBrowserCompatMediaItem = (byte) (measureonly.MediaBrowserCompatMediaItem | 16);
                    } else if (b3 == 4) {
                        measureonly.RatingCompat = jsonReader.nextLong();
                        measureonly.MediaBrowserCompatMediaItem = (byte) (measureonly.MediaBrowserCompatMediaItem | 8);
                    } else if (b3 != 5) {
                        jsonReader.skipValue();
                    } else {
                        measureonly.read = jsonReader.nextBoolean();
                        measureonly.MediaBrowserCompatMediaItem = (byte) (measureonly.MediaBrowserCompatMediaItem | 2);
                    }
                }
                jsonReader.endObject();
                remeasureonly.serializer = measureonly.read();
            } else if (b != 1) {
                remeasureIfNeededdefault remeasureifneededdefault = null;
                if (b == 2) {
                    jsonReader.beginObject();
                    requestRemeasuredefault requestremeasuredefault = null;
                    List listUnmodifiableList = null;
                    List listUnmodifiableList2 = null;
                    Boolean boolValueOf = null;
                    getUncaughtExceptionHandlerui getuncaughtexceptionhandleruiMediaSessionCompatQueueItem = null;
                    List listUnmodifiableList3 = null;
                    boolean z = false;
                    int iNextInt = 0;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        strNextName3.getClass();
                        switch (strNextName3.hashCode()) {
                            case -1405314732:
                                if (!strNextName3.equals("appProcessDetails")) {
                                    i = -1;
                                } else {
                                    i = 0;
                                }
                                break;
                            case -1332194002:
                                if (!strNextName3.equals("background")) {
                                    i = -1;
                                } else {
                                    i = 1;
                                }
                                break;
                            case -1090974952:
                                if (!strNextName3.equals("execution")) {
                                    i = -1;
                                } else {
                                    i = i6;
                                }
                                break;
                            case -80231855:
                                if (!strNextName3.equals("internalKeys")) {
                                    i = -1;
                                } else {
                                    i = i5;
                                }
                                break;
                            case 555169704:
                                if (!strNextName3.equals("customAttributes")) {
                                    i = -1;
                                } else {
                                    i = i4;
                                }
                                break;
                            case 928737948:
                                if (!strNextName3.equals("uiOrientation")) {
                                    i = -1;
                                } else {
                                    i = i3;
                                }
                                break;
                            case 1847730860:
                                if (!strNextName3.equals("currentProcessDetails")) {
                                    i = -1;
                                } else {
                                    i = 6;
                                }
                                break;
                            default:
                                i = -1;
                                break;
                        }
                        switch (i) {
                            case 0:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(MediaSessionCompatQueueItem(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList3 = Collections.unmodifiableList(arrayList);
                                break;
                            case 1:
                                boolValueOf = Boolean.valueOf(jsonReader.nextBoolean());
                                break;
                            case 2:
                                jsonReader.beginObject();
                                remeasureIfNeededdefault remeasureifneededdefault2 = remeasureifneededdefault;
                                remeasureIfNeededdefault remeasureifneededdefault3 = remeasureifneededdefault2;
                                remeasureIfNeededdefault remeasureifneededdefault4 = remeasureifneededdefault3;
                                remeasureIfNeededdefault remeasureifneededdefault5 = remeasureifneededdefault4;
                                ?? IconCompatParcelizer2 = remeasureifneededdefault5;
                                ?? IconCompatParcelizer3 = remeasureifneededdefault2;
                                ?? r22 = remeasureifneededdefault3;
                                ?? IconCompatParcelizer4 = remeasureifneededdefault4;
                                ?? getduringmeasurelayoutui = remeasureifneededdefault5;
                                while (jsonReader.hasNext()) {
                                    String strNextName4 = jsonReader.nextName();
                                    strNextName4.getClass();
                                    switch (strNextName4) {
                                        case "appExitInfo":
                                            i2 = 0;
                                            break;
                                        case "threads":
                                            i2 = 1;
                                            break;
                                        case "signal":
                                            i2 = i6;
                                            break;
                                        case "binaries":
                                            i2 = i5;
                                            break;
                                        case "exception":
                                            i2 = i4;
                                            break;
                                        default:
                                            i2 = -1;
                                            break;
                                    }
                                    if (i2 == 0) {
                                        IconCompatParcelizer4 = IconCompatParcelizer(jsonReader);
                                    } else if (i2 == 1) {
                                        IconCompatParcelizer3 = IconCompatParcelizer(jsonReader, new Gson$$ExternalSyntheticBUOutline0(2));
                                    } else if (i2 == i6) {
                                        jsonReader.beginObject();
                                        long jNextLong = 0;
                                        remeasureIfNeededdefault remeasureifneededdefault6 = remeasureifneededdefault;
                                        ?? NextString = remeasureifneededdefault6;
                                        byte b4 = 0;
                                        ?? r4 = remeasureifneededdefault6;
                                        while (jsonReader.hasNext()) {
                                            String strNextName5 = jsonReader.nextName();
                                            strNextName5.getClass();
                                            int iHashCode = strNextName5.hashCode();
                                            if (iHashCode != -1147692044) {
                                                if (iHashCode != 3059181) {
                                                    if (iHashCode == 3373707 && strNextName5.equals("name")) {
                                                        b2 = 2;
                                                    } else {
                                                        b2 = -1;
                                                    }
                                                } else if (strNextName5.equals("code")) {
                                                    b2 = 1;
                                                } else {
                                                    b2 = -1;
                                                }
                                            } else if (strNextName5.equals("address")) {
                                                b2 = 0;
                                            } else {
                                                b2 = -1;
                                            }
                                            if (b2 != 0) {
                                                if (b2 == 1) {
                                                    NextString = jsonReader.nextString();
                                                    if (NextString == 0) {
                                                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null code");
                                                        return null;
                                                    }
                                                } else if (b2 != 2) {
                                                    jsonReader.skipValue();
                                                    r4 = r4;
                                                } else {
                                                    strNextString = jsonReader.nextString();
                                                    if (strNextString == null) {
                                                        r4 = strNextString;
                                                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null name");
                                                        return null;
                                                    }
                                                }
                                                r4 = r4;
                                                NextString = NextString;
                                            } else {
                                                jNextLong = jsonReader.nextLong();
                                                b4 = (byte) (b4 | 1);
                                                r4 = r4;
                                            }
                                            r4 = strNextString;
                                            r4 = r4;
                                            NextString = NextString;
                                        }
                                        jsonReader.endObject();
                                        if (b4 == 1 && r4 != 0 && NextString != 0) {
                                            getduringmeasurelayoutui = new getDuringMeasureLayoutui(r4, NextString, jNextLong);
                                        } else {
                                            StringBuilder sb = new StringBuilder();
                                            if (r4 == 0) {
                                                sb.append(" name");
                                            }
                                            if (NextString == 0) {
                                                sb.append(" code");
                                            }
                                            if ((b4 & 1) == 0) {
                                                sb.append(" address");
                                            }
                                            ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
                                            return null;
                                        }
                                    } else if (i2 == i5) {
                                        IconCompatParcelizer2 = IconCompatParcelizer(jsonReader, new Gson$$ExternalSyntheticBUOutline0(i5));
                                        if (IconCompatParcelizer2 == 0) {
                                            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null binaries");
                                            return remeasureifneededdefault;
                                        }
                                    } else if (i2 != i4) {
                                        jsonReader.skipValue();
                                    } else {
                                        r22 = read(jsonReader);
                                    }
                                    remeasureifneededdefault = null;
                                    i4 = 4;
                                    i5 = 3;
                                    i6 = 2;
                                    IconCompatParcelizer3 = IconCompatParcelizer3;
                                    r22 = r22;
                                    IconCompatParcelizer4 = IconCompatParcelizer4;
                                    getduringmeasurelayoutui = getduringmeasurelayoutui;
                                    IconCompatParcelizer2 = IconCompatParcelizer2;
                                }
                                jsonReader.endObject();
                                if (getduringmeasurelayoutui != 0 && IconCompatParcelizer2 != 0) {
                                    requestremeasuredefault = new requestRemeasuredefault(IconCompatParcelizer3, r22, IconCompatParcelizer4, getduringmeasurelayoutui, IconCompatParcelizer2);
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    if (getduringmeasurelayoutui == 0) {
                                        sb2.append(" signal");
                                    }
                                    if (IconCompatParcelizer2 == 0) {
                                        sb2.append(" binaries");
                                    }
                                    ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m("Missing required properties:", sb2));
                                    return null;
                                }
                                break;
                            case 3:
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(RemoteActionCompatParcelizer(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList2 = Collections.unmodifiableList(arrayList2);
                                break;
                            case 4:
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(RemoteActionCompatParcelizer(jsonReader));
                                }
                                jsonReader.endArray();
                                listUnmodifiableList = Collections.unmodifiableList(arrayList3);
                                break;
                            case 5:
                                iNextInt = jsonReader.nextInt();
                                z = true;
                                break;
                            case 6:
                                getuncaughtexceptionhandleruiMediaSessionCompatQueueItem = MediaSessionCompatQueueItem(jsonReader);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                        remeasureifneededdefault = null;
                        i3 = 5;
                        i4 = 4;
                        i5 = 3;
                        i6 = 2;
                    }
                    jsonReader.endObject();
                    if (z && requestremeasuredefault != null) {
                        remeasureonly.IconCompatParcelizer = new dispatchOnPositionedCallbacks(requestremeasuredefault, listUnmodifiableList, listUnmodifiableList2, boolValueOf, getuncaughtexceptionhandleruiMediaSessionCompatQueueItem, listUnmodifiableList3, iNextInt);
                    } else {
                        StringBuilder sb3 = new StringBuilder();
                        if (requestremeasuredefault == null) {
                            sb3.append(" execution");
                        }
                        if (!z) {
                            sb3.append(" uiOrientation");
                        }
                        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m("Missing required properties:", sb3));
                        return null;
                    }
                } else if (b == 3) {
                    jsonReader.beginObject();
                    String strNextString2 = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals(RemoteMessageConst.Notification.CONTENT)) {
                            strNextString2 = jsonReader.nextString();
                            if (strNextString2 == null) {
                                ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null content");
                                return null;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (strNextString2 != null) {
                        remeasureonly.RemoteActionCompatParcelizer = new requestLookaheadRelayout(strNextString2);
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.write("Missing required properties: content");
                        return null;
                    }
                } else if (b == 4) {
                    String strNextString3 = jsonReader.nextString();
                    if (strNextString3 != null) {
                        remeasureonly.MediaSessionCompatQueueItem = strNextString3;
                    } else {
                        ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null type");
                        return null;
                    }
                } else if (b != 5) {
                    jsonReader.skipValue();
                } else {
                    remeasureonly.RatingCompat = jsonReader.nextLong();
                    remeasureonly.write = (byte) (remeasureonly.write | 1);
                }
            } else {
                requestOnPositionedCallback requestonpositionedcallback = new requestOnPositionedCallback();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName6 = jsonReader.nextName();
                    strNextName6.getClass();
                    if (!strNextName6.equals("assignments")) {
                        jsonReader.skipValue();
                    } else {
                        requestonpositionedcallback.serializer(IconCompatParcelizer(jsonReader, new GooglePlayLocationUtils$$ExternalSyntheticLambda18(25)));
                    }
                }
                jsonReader.endObject();
                remeasureonly.read = requestonpositionedcallback.RemoteActionCompatParcelizer();
            }
        }
        jsonReader.endObject();
        return remeasureonly.read();
    }

    public static measureAndLayoutdefault RemoteActionCompatParcelizer(android.util.JsonReader jsonReader) throws IOException {
        jsonReader.beginObject();
        String strNextString = null;
        String strNextString2 = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            if (strNextName.equals("key")) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null key");
                    return null;
                }
            } else if (strNextName.equals("value")) {
                strNextString2 = jsonReader.nextString();
                if (strNextString2 == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null value");
                    return null;
                }
            } else {
                jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        if (strNextString != null && strNextString2 != null) {
            return new measureAndLayoutdefault(strNextString, strNextString2);
        }
        StringBuilder sb = new StringBuilder();
        if (strNextString == null) {
            sb.append(" key");
        }
        if (strNextString2 == null) {
            sb.append(" value");
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
        return null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    public static forceMeasureTheSubtree read(android.util.JsonReader jsonReader) throws IOException {
        byte b;
        jsonReader.beginObject();
        byte b2 = 0;
        int iNextInt = 0;
        String strNextString = null;
        String strNextString2 = null;
        List listIconCompatParcelizer = null;
        forceMeasureTheSubtree forcemeasurethesubtree = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            strNextName.getClass();
            switch (strNextName) {
                case "frames":
                    b = 0;
                    break;
                case "reason":
                    b = 1;
                    break;
                case "type":
                    b = 2;
                    break;
                case "causedBy":
                    b = 3;
                    break;
                case "overflowCount":
                    b = 4;
                    break;
                default:
                    b = -1;
                    break;
            }
            if (b == 0) {
                listIconCompatParcelizer = IconCompatParcelizer(jsonReader, new Gson$$ExternalSyntheticBUOutline0(4));
                if (listIconCompatParcelizer == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null frames");
                    return null;
                }
            } else if (b == 1) {
                strNextString2 = jsonReader.nextString();
            } else if (b == 2) {
                strNextString = jsonReader.nextString();
                if (strNextString == null) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Null type");
                    return null;
                }
            } else if (b == 3) {
                forcemeasurethesubtree = read(jsonReader);
            } else if (b != 4) {
                jsonReader.skipValue();
            } else {
                iNextInt = jsonReader.nextInt();
                b2 = (byte) (b2 | 1);
            }
        }
        jsonReader.endObject();
        if (b2 == 1 && strNextString != null && listIconCompatParcelizer != null) {
            return new forceMeasureTheSubtree(strNextString, strNextString2, listIconCompatParcelizer, forcemeasurethesubtree, iNextInt);
        }
        StringBuilder sb = new StringBuilder();
        if (strNextString == null) {
            sb.append(" type");
        }
        if (listIconCompatParcelizer == null) {
            sb.append(" frames");
        }
        if ((b2 & 1) == 0) {
            sb.append(" overflowCount");
        }
        ScreenStartObserver$$ExternalSyntheticLambda0.write(d$$ExternalSyntheticOutline0.m("Missing required properties:", sb));
        return null;
    }
}
