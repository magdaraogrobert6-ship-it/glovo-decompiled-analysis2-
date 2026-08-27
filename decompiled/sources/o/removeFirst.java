package o;

import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.google.android.gms.internal.gtm.zzbv;
import com.google.crypto.tink.proto.KeyData;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public abstract class removeFirst {
    public static final ConcurrentHashMap IconCompatParcelizer;
    public static final ConcurrentHashMap read;
    public static final ConcurrentHashMap serializer;
    public static final AtomicReference write;

    static {
        java.util.logging.Logger.getLogger(removeFirst.class.getName());
        write = new AtomicReference(new addLast());
        IconCompatParcelizer = new ConcurrentHashMap();
        read = new ConcurrentHashMap();
        new ConcurrentHashMap();
        serializer = new ConcurrentHashMap();
    }

    public static KeyData RemoteActionCompatParcelizer(isPlacedInLookahead isplacedinlookahead) {
        KeyData keyDataIconCompatParcelizer;
        synchronized (removeFirst.class) {
            LayoutModifierNodemaxIntrinsicWidth1 layoutModifierNodemaxIntrinsicWidth1 = ((addLast) write.get()).serializer(isplacedinlookahead.IconCompatParcelizer()).IconCompatParcelizer;
            removeNodesInRange removenodesinrange = new removeNodesInRange(layoutModifierNodemaxIntrinsicWidth1, layoutModifierNodemaxIntrinsicWidth1.read);
            if (!((Boolean) read.get(isplacedinlookahead.IconCompatParcelizer())).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + isplacedinlookahead.IconCompatParcelizer());
            }
            keyDataIconCompatParcelizer = removenodesinrange.IconCompatParcelizer(isplacedinlookahead.MediaBrowserCompatMediaItem());
        }
        return keyDataIconCompatParcelizer;
    }

    public static void read(String str, Map map, boolean z) {
        synchronized (removeFirst.class) {
            if (z) {
                try {
                    ConcurrentHashMap concurrentHashMap = read;
                    if (concurrentHashMap.containsKey(str) && !((Boolean) concurrentHashMap.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z) {
                if (((addLast) write.get()).RemoteActionCompatParcelizer.containsKey(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!serializer.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (serializer.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template " + ((String) entry2.getKey()));
                        }
                    }
                }
            }
        }
    }

    public static void serializer(LayoutModifierNodemaxIntrinsicWidth1 layoutModifierNodemaxIntrinsicWidth1, boolean z) {
        synchronized (removeFirst.class) {
            AtomicReference atomicReference = write;
            addLast addlast = new addLast((addLast) atomicReference.get());
            addlast.RemoteActionCompatParcelizer(layoutModifierNodemaxIntrinsicWidth1);
            String str = layoutModifierNodemaxIntrinsicWidth1.read();
            read(str, z ? layoutModifierNodemaxIntrinsicWidth1.IconCompatParcelizer().IconCompatParcelizer() : Collections.EMPTY_MAP, z);
            if (!((addLast) atomicReference.get()).RemoteActionCompatParcelizer.containsKey(str)) {
                IconCompatParcelizer.put(str, new speculativeHit(0));
                if (z) {
                    write(str, layoutModifierNodemaxIntrinsicWidth1.IconCompatParcelizer().IconCompatParcelizer());
                }
            }
            read.put(str, Boolean.valueOf(z));
            atomicReference.set(addlast);
        }
    }

    public static Object write(String str, setOnAttachui setonattachui, Class cls) {
        addLast addlast = (addLast) write.get();
        addlast.getClass();
        addFirst addfirstSerializer = addlast.serializer(str);
        Set setKeySet = addfirstSerializer.IconCompatParcelizer.write.keySet();
        LayoutModifierNodemaxIntrinsicWidth1 layoutModifierNodemaxIntrinsicWidth1 = addfirstSerializer.IconCompatParcelizer;
        if (!setKeySet.contains(cls)) {
            StringBuilder sb = new StringBuilder("Primitive type ");
            sb.append(cls.getName());
            sb.append(" not supported by key manager of type ");
            sb.append(layoutModifierNodemaxIntrinsicWidth1.getClass());
            sb.append(", supported primitives: ");
            Set<Class> setKeySet2 = layoutModifierNodemaxIntrinsicWidth1.write.keySet();
            StringBuilder sb2 = new StringBuilder();
            boolean z = true;
            for (Class cls2 : setKeySet2) {
                if (!z) {
                    sb2.append(", ");
                }
                sb2.append(cls2.getCanonicalName());
                z = false;
            }
            sb.append(sb2.toString());
            throw new GeneralSecurityException(sb.toString());
        }
        try {
            if (!layoutModifierNodemaxIntrinsicWidth1.write.keySet().contains(cls) && !Void.class.equals(cls)) {
                throw new IllegalArgumentException("Given internalKeyMananger " + layoutModifierNodemaxIntrinsicWidth1.toString() + " does not support primitive class " + cls.getName());
            }
            try {
                setInteropViewFactoryHolderui setinteropviewfactoryholderuiRemoteActionCompatParcelizer = layoutModifierNodemaxIntrinsicWidth1.RemoteActionCompatParcelizer(setonattachui);
                if (Void.class.equals(cls)) {
                    throw new GeneralSecurityException("Cannot create a primitive for Void");
                }
                layoutModifierNodemaxIntrinsicWidth1.serializer(setinteropviewfactoryholderuiRemoteActionCompatParcelizer);
                LayoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode = (LayoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode) layoutModifierNodemaxIntrinsicWidth1.write.get(cls);
                if (layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode != null) {
                    return layoutModifierNodeCoordinatorLookaheadDelegateForLayoutModifierNode.read(setinteropviewfactoryholderuiRemoteActionCompatParcelizer);
                }
                r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.read("Requested primitive class ", cls.getCanonicalName(), " not supported.");
                return null;
            } catch (com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException e) {
                throw new GeneralSecurityException("Failures parsing proto of type ".concat(layoutModifierNodemaxIntrinsicWidth1.IconCompatParcelizer.getName()), e);
            }
        } catch (IllegalArgumentException e2) {
            throw new GeneralSecurityException("Primitive type not supported", e2);
        }
    }

    public static Object write(removeNodeAtDepth removenodeatdepth, Class cls) {
        LayoutModifierNodeKt layoutModifierNodeKt = (LayoutModifierNodeKt) getWrappedNonNull.serializer.IconCompatParcelizer.get();
        layoutModifierNodeKt.getClass();
        LayoutModifierNodeCoordinatormeasure1111 layoutModifierNodeCoordinatormeasure1111 = new LayoutModifierNodeCoordinatormeasure1111(removenodeatdepth.getClass(), cls);
        HashMap map = layoutModifierNodeKt.serializer;
        if (!map.containsKey(layoutModifierNodeCoordinatormeasure1111)) {
            getAlignmentLinesMap.read("No PrimitiveConstructor for ", layoutModifierNodeCoordinatormeasure1111, " available");
            return null;
        }
        if (((setLookaheadConstraints_Sx5XlMui) map.get(layoutModifierNodeCoordinatormeasure1111)).RemoteActionCompatParcelizer.IconCompatParcelizer != 13) {
            return new getTraceContext();
        }
        return new hitTest6fMxITsuidefault();
    }

    public static void write(removeLast removelast) {
        synchronized (removeFirst.class) {
            getWrappedNonNull getwrappednonnull = getWrappedNonNull.serializer;
            synchronized (getwrappednonnull) {
                zzbv zzbvVar = new zzbv((LayoutModifierNodeKt) getwrappednonnull.IconCompatParcelizer.get());
                zzbvVar.write(removelast);
                getwrappednonnull.IconCompatParcelizer.set(new LayoutModifierNodeKt(zzbvVar));
            }
        }
    }

    public static void write(String str, Map map) {
        requestRemeasureui requestremeasureui;
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            byte[] bArrParcelableVolumeInfo = ((setInteropViewFactoryHolderui) ((LayoutModifierNodeminIntrinsicWidth1) entry.getValue()).read).ParcelableVolumeInfo();
            indexOf indexof = ((LayoutModifierNodeminIntrinsicWidth1) entry.getValue()).RemoteActionCompatParcelizer;
            invalidateParentDataui invalidateparentdatauiSerializer = isPlacedInLookahead.serializer();
            invalidateparentdatauiSerializer.MediaMetadataCompat();
            isPlacedInLookahead.serializer((isPlacedInLookahead) invalidateparentdatauiSerializer.read, str);
            setOnDetachui setondetachuiRemoteActionCompatParcelizer = setOnAttachui.RemoteActionCompatParcelizer(bArrParcelableVolumeInfo, 0, bArrParcelableVolumeInfo.length);
            invalidateparentdatauiSerializer.MediaMetadataCompat();
            isPlacedInLookahead.read((isPlacedInLookahead) invalidateparentdatauiSerializer.read, setondetachuiRemoteActionCompatParcelizer);
            int i = hitInMinimumTouchTarget.read[indexof.ordinal()];
            if (i == 1) {
                requestremeasureui = requestRemeasureui.TINK;
            } else if (i == 2) {
                requestremeasureui = requestRemeasureui.LEGACY;
            } else if (i == 3) {
                requestremeasureui = requestRemeasureui.RAW;
            } else {
                if (i != 4) {
                    ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Unknown output prefix type");
                    return;
                }
                requestremeasureui = requestRemeasureui.CRUNCHY;
            }
            invalidateparentdatauiSerializer.MediaMetadataCompat();
            isPlacedInLookahead.RemoteActionCompatParcelizer((isPlacedInLookahead) invalidateparentdatauiSerializer.read, requestremeasureui);
            serializer.put(str2, new acceptHits((isPlacedInLookahead) invalidateparentdatauiSerializer.MediaBrowserCompatMediaItem()));
        }
    }

    public static Object RemoteActionCompatParcelizer(String str, byte[] bArr) {
        setOnDetachui setondetachui = setOnAttachui.IconCompatParcelizer;
        return write(str, setOnAttachui.RemoteActionCompatParcelizer(bArr, 0, bArr.length), findBestHitDistancefn2tFes.class);
    }
}
