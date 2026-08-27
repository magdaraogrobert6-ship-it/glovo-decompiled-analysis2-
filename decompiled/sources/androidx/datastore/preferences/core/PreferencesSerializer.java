package androidx.datastore.preferences.core;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.SingleProcessDataStore;
import androidx.datastore.core.SingleProcessDataStore$file$2;
import androidx.datastore.preferences.PreferencesProto$PreferenceMap;
import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import io.sentry.util.UrlUtils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.Focusability;
import o.InvalidateSemantics;
import o.OneDimensionalFocusSearchKt;
import o.RegistryNoModelLoaderAvailableException;
import o.RequestChildFocusKt;
import o.TwoDimensionalFocusSearchKtgenerateAndSearchChildren1;
import o.accesssearchChildren4C6V_qg;
import o.backwardFocusSearch;
import o.createFromParcel;
import o.forwardFocusSearch;
import o.generateAndSearchChildren4C6V_qg;
import o.getInvalidFocusDirectionannotations;
import o.getNoActiveChildannotations;
import o.instance_delegatelambda0;
import o.isBetterCandidate_I7lrPNgminorAxisDistance;
import o.isRoot;
import o.onContentCardDismissed;
import o.onDispatchEventsCompleted;
import o.oneDimensionalFocusSearchOMvw8;
import o.performRequestFocus;
import o.pickChildForBackwardSearch;
import o.prepareForActivityTransitionCarryover;
import o.r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.removeNodeAtDepth;
import o.setNativeShader;
import o.sourceInformationContextOfdefault;

/* JADX INFO: loaded from: classes.dex */
public final class PreferencesSerializer implements performRequestFocus {
    public static final PreferencesSerializer IconCompatParcelizer = new PreferencesSerializer();

    @Override // o.performRequestFocus
    public Object write() {
        return setNativeShader.read();
    }

    @Override // o.performRequestFocus
    public Object writeTo(Object obj, RegistryNoModelLoaderAvailableException registryNoModelLoaderAvailableException, Focusability focusability) throws IOException {
        isBetterCandidate_I7lrPNgminorAxisDistance isbettercandidate_i7lrpngminoraxisdistanceIconCompatParcelizer;
        Map map = ((getNoActiveChildannotations) obj).read();
        OneDimensionalFocusSearchKt oneDimensionalFocusSearchKtWrite = PreferencesProto$PreferenceMap.write();
        for (Map.Entry entry : map.entrySet()) {
            isRoot isroot = (isRoot) entry.getKey();
            Object value = entry.getValue();
            String str = isroot.IconCompatParcelizer;
            if (value instanceof Boolean) {
                generateAndSearchChildren4C6V_qg generateandsearchchildren4c6v_qgIconCompatParcelizer = InvalidateSemantics.IconCompatParcelizer();
                boolean zBooleanValue = ((Boolean) value).booleanValue();
                generateandsearchchildren4c6v_qgIconCompatParcelizer.write();
                InvalidateSemantics.read((InvalidateSemantics) generateandsearchchildren4c6v_qgIconCompatParcelizer.serializer, zBooleanValue);
                isbettercandidate_i7lrpngminoraxisdistanceIconCompatParcelizer = generateandsearchchildren4c6v_qgIconCompatParcelizer.IconCompatParcelizer();
            } else if (value instanceof Float) {
                generateAndSearchChildren4C6V_qg generateandsearchchildren4c6v_qgIconCompatParcelizer2 = InvalidateSemantics.IconCompatParcelizer();
                float fFloatValue = ((Number) value).floatValue();
                generateandsearchchildren4c6v_qgIconCompatParcelizer2.write();
                InvalidateSemantics.serializer((InvalidateSemantics) generateandsearchchildren4c6v_qgIconCompatParcelizer2.serializer, fFloatValue);
                isbettercandidate_i7lrpngminoraxisdistanceIconCompatParcelizer = generateandsearchchildren4c6v_qgIconCompatParcelizer2.IconCompatParcelizer();
            } else if (value instanceof Double) {
                generateAndSearchChildren4C6V_qg generateandsearchchildren4c6v_qgIconCompatParcelizer3 = InvalidateSemantics.IconCompatParcelizer();
                double dDoubleValue = ((Number) value).doubleValue();
                generateandsearchchildren4c6v_qgIconCompatParcelizer3.write();
                InvalidateSemantics.RemoteActionCompatParcelizer((InvalidateSemantics) generateandsearchchildren4c6v_qgIconCompatParcelizer3.serializer, dDoubleValue);
                isbettercandidate_i7lrpngminoraxisdistanceIconCompatParcelizer = generateandsearchchildren4c6v_qgIconCompatParcelizer3.IconCompatParcelizer();
            } else if (value instanceof Integer) {
                generateAndSearchChildren4C6V_qg generateandsearchchildren4c6v_qgIconCompatParcelizer4 = InvalidateSemantics.IconCompatParcelizer();
                int iIntValue = ((Number) value).intValue();
                generateandsearchchildren4c6v_qgIconCompatParcelizer4.write();
                InvalidateSemantics.serializer((InvalidateSemantics) generateandsearchchildren4c6v_qgIconCompatParcelizer4.serializer, iIntValue);
                isbettercandidate_i7lrpngminoraxisdistanceIconCompatParcelizer = generateandsearchchildren4c6v_qgIconCompatParcelizer4.IconCompatParcelizer();
            } else if (value instanceof Long) {
                generateAndSearchChildren4C6V_qg generateandsearchchildren4c6v_qgIconCompatParcelizer5 = InvalidateSemantics.IconCompatParcelizer();
                long jLongValue = ((Number) value).longValue();
                generateandsearchchildren4c6v_qgIconCompatParcelizer5.write();
                InvalidateSemantics.IconCompatParcelizer((InvalidateSemantics) generateandsearchchildren4c6v_qgIconCompatParcelizer5.serializer, jLongValue);
                isbettercandidate_i7lrpngminoraxisdistanceIconCompatParcelizer = generateandsearchchildren4c6v_qgIconCompatParcelizer5.IconCompatParcelizer();
            } else if (value instanceof String) {
                generateAndSearchChildren4C6V_qg generateandsearchchildren4c6v_qgIconCompatParcelizer6 = InvalidateSemantics.IconCompatParcelizer();
                generateandsearchchildren4c6v_qgIconCompatParcelizer6.write();
                InvalidateSemantics.RemoteActionCompatParcelizer((InvalidateSemantics) generateandsearchchildren4c6v_qgIconCompatParcelizer6.serializer, (String) value);
                isbettercandidate_i7lrpngminoraxisdistanceIconCompatParcelizer = generateandsearchchildren4c6v_qgIconCompatParcelizer6.IconCompatParcelizer();
            } else {
                if (!(value instanceof Set)) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write(removeNodeAtDepth.write((Object) value.getClass().getName(), "PreferencesSerializer does not support type: "));
                    return null;
                }
                generateAndSearchChildren4C6V_qg generateandsearchchildren4c6v_qgIconCompatParcelizer7 = InvalidateSemantics.IconCompatParcelizer();
                onDispatchEventsCompleted ondispatcheventscompletedIconCompatParcelizer = accesssearchChildren4C6V_qg.IconCompatParcelizer();
                ondispatcheventscompletedIconCompatParcelizer.RemoteActionCompatParcelizer((Set) value);
                generateandsearchchildren4c6v_qgIconCompatParcelizer7.write();
                InvalidateSemantics.RemoteActionCompatParcelizer((InvalidateSemantics) generateandsearchchildren4c6v_qgIconCompatParcelizer7.serializer, ondispatcheventscompletedIconCompatParcelizer);
                isbettercandidate_i7lrpngminoraxisdistanceIconCompatParcelizer = generateandsearchchildren4c6v_qgIconCompatParcelizer7.IconCompatParcelizer();
            }
            oneDimensionalFocusSearchKtWrite.getClass();
            str.getClass();
            oneDimensionalFocusSearchKtWrite.write();
            PreferencesProto$PreferenceMap.IconCompatParcelizer((PreferencesProto$PreferenceMap) oneDimensionalFocusSearchKtWrite.serializer).put(str, (InvalidateSemantics) isbettercandidate_i7lrpngminoraxisdistanceIconCompatParcelizer);
        }
        PreferencesProto$PreferenceMap preferencesProto$PreferenceMap = (PreferencesProto$PreferenceMap) oneDimensionalFocusSearchKtWrite.IconCompatParcelizer();
        int iMediaSessionCompatToken = preferencesProto$PreferenceMap.MediaSessionCompatToken();
        Logger logger = RequestChildFocusKt.IconCompatParcelizer;
        if (iMediaSessionCompatToken > 4096) {
            iMediaSessionCompatToken = 4096;
        }
        RequestChildFocusKt requestChildFocusKt = new RequestChildFocusKt(registryNoModelLoaderAvailableException, iMediaSessionCompatToken);
        preferencesProto$PreferenceMap.read(requestChildFocusKt);
        if (requestChildFocusKt.MediaSessionCompatQueueItem > 0) {
            requestChildFocusKt.read();
        }
        return createFromParcel.INSTANCE;
    }

    @Override // o.performRequestFocus
    public Object RemoteActionCompatParcelizer(FileInputStream fileInputStream) throws CorruptionException {
        fileInputStream.getClass();
        try {
            PreferencesProto$PreferenceMap preferencesProto$PreferenceMapSerializer = PreferencesProto$PreferenceMap.serializer(fileInputStream);
            backwardFocusSearch backwardfocussearch = new backwardFocusSearch(false);
            oneDimensionalFocusSearchOMvw8[] onedimensionalfocussearchomvw8Arr = (oneDimensionalFocusSearchOMvw8[]) Arrays.copyOf(new oneDimensionalFocusSearchOMvw8[0], 0);
            backwardfocussearch.RemoteActionCompatParcelizer();
            if (onedimensionalfocussearchomvw8Arr.length > 0) {
                oneDimensionalFocusSearchOMvw8 onedimensionalfocussearchomvw8 = onedimensionalfocussearchomvw8Arr[0];
                throw null;
            }
            Map mapRemoteActionCompatParcelizer = preferencesProto$PreferenceMapSerializer.RemoteActionCompatParcelizer();
            mapRemoteActionCompatParcelizer.getClass();
            for (Map.Entry entry : mapRemoteActionCompatParcelizer.entrySet()) {
                String str = (String) entry.getKey();
                InvalidateSemantics invalidateSemantics = (InvalidateSemantics) entry.getValue();
                str.getClass();
                invalidateSemantics.getClass();
                forwardFocusSearch forwardfocussearchRatingCompat = invalidateSemantics.RatingCompat();
                switch (forwardfocussearchRatingCompat == null ? -1 : getInvalidFocusDirectionannotations.serializer[forwardfocussearchRatingCompat.ordinal()]) {
                    case -1:
                        throw new CorruptionException("Value case is null.", null);
                    case 0:
                    default:
                        ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer();
                        return null;
                    case 1:
                        backwardfocussearch.serializer(new isRoot(str), Boolean.valueOf(invalidateSemantics.write()));
                        break;
                    case 2:
                        backwardfocussearch.serializer(new isRoot(str), Float.valueOf(invalidateSemantics.serializer()));
                        break;
                    case 3:
                        backwardfocussearch.serializer(new isRoot(str), Double.valueOf(invalidateSemantics.RemoteActionCompatParcelizer()));
                        break;
                    case 4:
                        backwardfocussearch.serializer(new isRoot(str), Integer.valueOf(invalidateSemantics.MediaBrowserCompatMediaItem()));
                        break;
                    case 5:
                        backwardfocussearch.serializer(new isRoot(str), Long.valueOf(invalidateSemantics.MediaSessionCompatQueueItem()));
                        break;
                    case 6:
                        isRoot isroot = new isRoot(str);
                        String strMediaMetadataCompat = invalidateSemantics.MediaMetadataCompat();
                        strMediaMetadataCompat.getClass();
                        backwardfocussearch.serializer(isroot, strMediaMetadataCompat);
                        break;
                    case 7:
                        isRoot isroot2 = new isRoot(str);
                        TwoDimensionalFocusSearchKtgenerateAndSearchChildren1 twoDimensionalFocusSearchKtgenerateAndSearchChildren1Write = invalidateSemantics.MediaDescriptionCompat().write();
                        twoDimensionalFocusSearchKtgenerateAndSearchChildren1Write.getClass();
                        backwardfocussearch.serializer(isroot2, onContentCardDismissed.r8lambda54BeH8ZsBru0CXI2CCSP2syNys(twoDimensionalFocusSearchKtgenerateAndSearchChildren1Write));
                        break;
                    case 8:
                        throw new CorruptionException("Value not set.", null);
                }
            }
            return new backwardFocusSearch(new LinkedHashMap(backwardfocussearch.read()), true);
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Unable to parse preferences proto.", e);
        }
    }

    public static pickChildForBackwardSearch write(ContextScope contextScope, r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0, int i) {
        if ((i & 4) != 0) {
            DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
            contextScope = YieldKt.RemoteActionCompatParcelizer(DefaultIoScheduler.RemoteActionCompatParcelizer.plus(UrlUtils.serializer()));
        }
        Object[] objArr = {null, instance_delegatelambda0.write, contextScope, new SingleProcessDataStore$file$2(2, r8lambdardpfsr94j4iebcwx_kpqzpm8k0)};
        return new pickChildForBackwardSearch((SingleProcessDataStore) r8lambda7AJnrvTmYNN7kSbgXUEYtB0Niyw.IconCompatParcelizer(-756067223, sourceInformationContextOfdefault.read(), sourceInformationContextOfdefault.read(), 756067223, sourceInformationContextOfdefault.read(), objArr, sourceInformationContextOfdefault.read()));
    }
}
