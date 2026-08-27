package o;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import bo.app.c8$$ExternalSyntheticOutline0;
import io.sentry.SentryUUID;
import o.AndroidContentCaptureManagerCompanion;
import o.DragAndDropNodestartDragAndDropTransfer1;
import o.ModalBottomSheetKtModalBottomSheet311;
import o.ModalBottomSheetYbuCTN8;
import o.createFromParcel;
import o.getBirthDateFull;
import o.getCieXyz;
import o.getPostalCode;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0;
import o.removeNodeAtDepth;

/* JADX INFO: loaded from: classes.dex */
public abstract class getCurrentSessionimpl {
    /* JADX WARN: Code duplicated, block: B:100:0x0117  */
    /* JADX WARN: Code duplicated, block: B:102:0x0123  */
    /* JADX WARN: Code duplicated, block: B:105:0x0142  */
    /* JADX WARN: Code duplicated, block: B:107:0x0193  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e4 A[PHI: r1 r2 r3 r4 r8
  0x00e4: PHI (r1v8 androidx.compose.ui.Modifier) = (r1v5 androidx.compose.ui.Modifier), (r1v12 androidx.compose.ui.Modifier) binds: [B:101:0x0121, B:84:0x00e1] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r2v12 androidx.compose.ui.graphics.Shape) = (r2v8 androidx.compose.ui.graphics.Shape), (r2v13 androidx.compose.ui.graphics.Shape) binds: [B:101:0x0121, B:84:0x00e1] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r3v24 int) = (r3v17 int), (r3v27 int) binds: [B:101:0x0121, B:84:0x00e1] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r4v14 o.SessionMutex) = (r4v7 o.SessionMutex), (r4v15 o.SessionMutex) binds: [B:101:0x0121, B:84:0x00e1] A[DONT_GENERATE, DONT_INLINE]
  0x00e4: PHI (r8v12 o.SessionMutexSession) = (r8v4 o.SessionMutexSession), (r8v2 o.SessionMutexSession) binds: [B:101:0x0121, B:84:0x00e1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x00eb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:92:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:96:0x0103  */
    /* JADX WARN: Code duplicated, block: B:97:0x0112  */
    public static final void read(androidx.compose.ui.Modifier modifier, androidx.compose.ui.graphics.Shape shape, SessionMutex sessionMutex, SessionMutexSession sessionMutexSession, position positionVar, final DragAndDropTargetModifierNode dragAndDropTargetModifierNode, getBirthDateFull getbirthdatefull, int i, int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        androidx.compose.ui.graphics.Shape shape2;
        SessionMutex sessionMutex2;
        SessionMutexSession sessionMutexSessionRemoteActionCompatParcelizer;
        position positionVar2;
        boolean z;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.ui.graphics.Shape shape3;
        SessionMutex sessionMutex3;
        SessionMutexSession sessionMutexSession2;
        position positionVar3;
        getHandleruiannotations gethandleruiannotationsMediaDescriptionCompat;
        SessionMutex sessionMutexSerializer;
        float f;
        Object objComponentActivity;
        int i4;
        int i5;
        int i6;
        getPostalCode getpostalcode = (getPostalCode) getbirthdatefull;
        getpostalcode.MediaSessionCompatQueueItem(1359693790);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (getpostalcode.read(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                shape2 = shape;
                int i8 = getpostalcode.read(shape2) ? 32 : 16;
                i3 |= i8;
            } else {
                shape2 = shape;
            }
            i3 |= i8;
        } else {
            shape2 = shape;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                sessionMutex2 = sessionMutex;
                if (getpostalcode.read(sessionMutex2)) {
                    i6 = androidx.compose.ui.graphics.Fields.RotationX;
                }
                i3 |= i6;
            } else {
                sessionMutex2 = sessionMutex;
            }
            i6 = androidx.compose.ui.graphics.Fields.SpotShadowColor;
            i3 |= i6;
        } else {
            sessionMutex2 = sessionMutex;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                sessionMutexSessionRemoteActionCompatParcelizer = sessionMutexSession;
                if (getpostalcode.read(sessionMutexSessionRemoteActionCompatParcelizer)) {
                    i5 = androidx.compose.ui.graphics.Fields.CameraDistance;
                }
                i3 |= i5;
            } else {
                sessionMutexSessionRemoteActionCompatParcelizer = sessionMutexSession;
            }
            i5 = androidx.compose.ui.graphics.Fields.RotationZ;
            i3 |= i5;
        } else {
            sessionMutexSessionRemoteActionCompatParcelizer = sessionMutexSession;
        }
        int i9 = i2 & 16;
        if (i9 == 0) {
            if ((i & 24576) == 0) {
                positionVar2 = positionVar;
                i3 |= getpostalcode.read(positionVar2) ? androidx.compose.ui.graphics.Fields.Clip : 8192;
            }
            if ((196608 & i) == 0) {
                if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                    i4 = androidx.compose.ui.graphics.Fields.RenderEffect;
                } else {
                    i4 = 65536;
                }
                i3 |= i4;
            }
            if ((74899 & i3) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (getpostalcode.write(i3 & 1, z)) {
                getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
                if ((i & 1) == 0 && !getpostalcode.PlaybackStateCompat()) {
                    getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                    shape3 = shape2;
                    sessionMutexSerializer = sessionMutex2;
                } else {
                    if (i7 != 0) {
                        modifier3 = androidx.compose.ui.Modifier.Companion;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i2 & 2) != 0) {
                        shape3 = setImeVisible.read(androidx.compose.material3.tokens.FilledCardTokens.RemoteActionCompatParcelizer, getpostalcode);
                        i3 &= -113;
                    } else {
                        shape3 = shape2;
                    }
                    if ((i2 & 4) != 0) {
                        sessionMutexSerializer = withSessionCancellingPreviousimpl.serializer((getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) getWindowPosturem18o9QQ.serializer));
                        i3 &= -897;
                    } else {
                        sessionMutexSerializer = sessionMutex2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        sessionMutexSessionRemoteActionCompatParcelizer = withSessionCancellingPreviousimpl.RemoteActionCompatParcelizer(0.0f, 63);
                    }
                    if (i9 != 0) {
                        positionVar3 = null;
                    }
                    SessionMutexSession sessionMutexSession3 = sessionMutexSessionRemoteActionCompatParcelizer;
                    int i10 = i3;
                    getpostalcode.RemoteActionCompatParcelizer();
                    long j = sessionMutexSerializer.read;
                    long j2 = sessionMutexSerializer.serializer;
                    f = sessionMutexSession3.RemoteActionCompatParcelizer;
                    getpostalcode.serializer(-1763481333);
                    getpostalcode.serializer(167751211);
                    objComponentActivity = getpostalcode.ComponentActivity();
                    if (objComponentActivity == getCreditCardExpirationMonth.write) {
                        objComponentActivity = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(androidx.compose.ui.unit.Dp.m3671boximpl(f));
                        getpostalcode.write(objComponentActivity);
                    }
                    getpostalcode.IconCompatParcelizer(false);
                    getpostalcode.IconCompatParcelizer(false);
                    androidx.compose.material3.SurfaceKt.m126SurfaceT9BRK9s(modifier3, shape3, j, j2, 0.0f, ((androidx.compose.ui.unit.Dp) ((PopulateViewStructure_androidKtpopulate7) objComponentActivity).getValue()).m3687unboximpl(), positionVar3, coil3.ExtrasKt.write(-97109725, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.CardKt$Card$1
                        /* JADX WARN: Code duplicated, block: B:18:0x0091  */
                        @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                        public final Object invoke(Object obj, Object obj2) {
                            getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                            int iIntValue = ((Number) obj2).intValue();
                            getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                            if (getpostalcode2.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                                Modifier.Companion companion = Modifier.Companion;
                                ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
                                int iSerializer = SentryUUID.serializer(getpostalcode2);
                                DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                                Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                                r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                                if (getpostalcode2.read == null) {
                                    SentryUUID.write();
                                    throw null;
                                }
                                getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                                if (getpostalcode2.ComponentActivity) {
                                    getpostalcode2.serializer(constructor);
                                } else {
                                    getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                                }
                                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modalBottomSheetYbuCTN8Serializer, companion2.getSetMeasurePolicy());
                                AndroidContentCaptureManagerCompanion.write(getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer, companion2.getSetResolvedCompositionLocals());
                                r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (getpostalcode2.ComponentActivity) {
                                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, setCompositeKeyHash);
                                } else {
                                    if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode2.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                        c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, setCompositeKeyHash);
                                    }
                                }
                                AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, companion2.getSetModifier());
                                dragAndDropTargetModifierNode.invoke(o.ModalBottomSheetKt.write, getpostalcode2, 6);
                                getpostalcode2.IconCompatParcelizer(true);
                            } else {
                                getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                            }
                            return createFromParcel.INSTANCE;
                        }
                    }, getpostalcode), getpostalcode, (i10 & 14) | 12582912 | (i10 & 112) | ((i10 << 6) & 3670016), 16);
                    SessionMutex sessionMutex4 = sessionMutexSerializer;
                    sessionMutexSession2 = sessionMutexSession3;
                    sessionMutex3 = sessionMutex4;
                }
                positionVar3 = positionVar2;
                SessionMutexSession sessionMutexSession4 = sessionMutexSessionRemoteActionCompatParcelizer;
                int i11 = i3;
                getpostalcode.RemoteActionCompatParcelizer();
                long j3 = sessionMutexSerializer.read;
                long j4 = sessionMutexSerializer.serializer;
                f = sessionMutexSession4.RemoteActionCompatParcelizer;
                getpostalcode.serializer(-1763481333);
                getpostalcode.serializer(167751211);
                objComponentActivity = getpostalcode.ComponentActivity();
                if (objComponentActivity == getCreditCardExpirationMonth.write) {
                    objComponentActivity = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(androidx.compose.ui.unit.Dp.m3671boximpl(f));
                    getpostalcode.write(objComponentActivity);
                }
                getpostalcode.IconCompatParcelizer(false);
                getpostalcode.IconCompatParcelizer(false);
                androidx.compose.material3.SurfaceKt.m126SurfaceT9BRK9s(modifier3, shape3, j3, j4, 0.0f, ((androidx.compose.ui.unit.Dp) ((PopulateViewStructure_androidKtpopulate7) objComponentActivity).getValue()).m3687unboximpl(), positionVar3, coil3.ExtrasKt.write(-97109725, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.CardKt$Card$1
                    /* JADX WARN: Code duplicated, block: B:18:0x0091  */
                    @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                    public final Object invoke(Object obj, Object obj2) {
                        getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                        int iIntValue = ((Number) obj2).intValue();
                        getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                        if (getpostalcode2.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                            Modifier.Companion companion = Modifier.Companion;
                            ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
                            int iSerializer = SentryUUID.serializer(getpostalcode2);
                            DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                            Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                            r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                            if (getpostalcode2.read == null) {
                                SentryUUID.write();
                                throw null;
                            }
                            getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                            if (getpostalcode2.ComponentActivity) {
                                getpostalcode2.serializer(constructor);
                            } else {
                                getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                            }
                            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modalBottomSheetYbuCTN8Serializer, companion2.getSetMeasurePolicy());
                            AndroidContentCaptureManagerCompanion.write(getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer, companion2.getSetResolvedCompositionLocals());
                            r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (getpostalcode2.ComponentActivity) {
                                c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, setCompositeKeyHash);
                            } else {
                                if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode2.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                    c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, setCompositeKeyHash);
                                }
                            }
                            AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, companion2.getSetModifier());
                            dragAndDropTargetModifierNode.invoke(o.ModalBottomSheetKt.write, getpostalcode2, 6);
                            getpostalcode2.IconCompatParcelizer(true);
                        } else {
                            getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                        }
                        return createFromParcel.INSTANCE;
                    }
                }, getpostalcode), getpostalcode, (i11 & 14) | 12582912 | (i11 & 112) | ((i11 << 6) & 3670016), 16);
                SessionMutex sessionMutex5 = sessionMutexSerializer;
                sessionMutexSession2 = sessionMutexSession4;
                sessionMutex3 = sessionMutex5;
            } else {
                getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                modifier3 = modifier2;
                shape3 = shape2;
                sessionMutex3 = sessionMutex2;
                sessionMutexSession2 = sessionMutexSessionRemoteActionCompatParcelizer;
                positionVar3 = positionVar2;
            }
            gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
            if (gethandleruiannotationsMediaDescriptionCompat != null) {
                gethandleruiannotationsMediaDescriptionCompat.serializer = new UiMediaScope(modifier3, shape3, sessionMutex3, sessionMutexSession2, positionVar3, dragAndDropTargetModifierNode, i, i2);
            }
        }
        i3 |= 24576;
        positionVar2 = positionVar;
        if ((196608 & i) == 0) {
            if (getpostalcode.IconCompatParcelizer(dragAndDropTargetModifierNode)) {
                i4 = androidx.compose.ui.graphics.Fields.RenderEffect;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (getpostalcode.write(i3 & 1, z)) {
            getpostalcode.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss();
            if ((i & 1) == 0) {
                if (i7 != 0) {
                    modifier3 = androidx.compose.ui.Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    shape3 = setImeVisible.read(androidx.compose.material3.tokens.FilledCardTokens.RemoteActionCompatParcelizer, getpostalcode);
                    i3 &= -113;
                } else {
                    shape3 = shape2;
                }
                if ((i2 & 4) != 0) {
                    sessionMutexSerializer = withSessionCancellingPreviousimpl.serializer((getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) getWindowPosturem18o9QQ.serializer));
                    i3 &= -897;
                } else {
                    sessionMutexSerializer = sessionMutex2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    sessionMutexSessionRemoteActionCompatParcelizer = withSessionCancellingPreviousimpl.RemoteActionCompatParcelizer(0.0f, 63);
                }
                if (i9 != 0) {
                    positionVar3 = null;
                } else {
                    positionVar3 = positionVar2;
                }
            } else {
                if (i7 != 0) {
                    modifier3 = androidx.compose.ui.Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if ((i2 & 2) != 0) {
                    shape3 = setImeVisible.read(androidx.compose.material3.tokens.FilledCardTokens.RemoteActionCompatParcelizer, getpostalcode);
                    i3 &= -113;
                } else {
                    shape3 = shape2;
                }
                if ((i2 & 4) != 0) {
                    sessionMutexSerializer = withSessionCancellingPreviousimpl.serializer((getViewingDistancetKroMQ) getpostalcode.write((getNewPassword) getWindowPosturem18o9QQ.serializer));
                    i3 &= -897;
                } else {
                    sessionMutexSerializer = sessionMutex2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    sessionMutexSessionRemoteActionCompatParcelizer = withSessionCancellingPreviousimpl.RemoteActionCompatParcelizer(0.0f, 63);
                }
                if (i9 != 0) {
                    positionVar3 = null;
                } else {
                    positionVar3 = positionVar2;
                }
            }
            SessionMutexSession sessionMutexSession5 = sessionMutexSessionRemoteActionCompatParcelizer;
            int i12 = i3;
            getpostalcode.RemoteActionCompatParcelizer();
            long j5 = sessionMutexSerializer.read;
            long j6 = sessionMutexSerializer.serializer;
            f = sessionMutexSession5.RemoteActionCompatParcelizer;
            getpostalcode.serializer(-1763481333);
            getpostalcode.serializer(167751211);
            objComponentActivity = getpostalcode.ComponentActivity();
            if (objComponentActivity == getCreditCardExpirationMonth.write) {
                objComponentActivity = androidx.compose.runtime.CompositionKt.RemoteActionCompatParcelizer(androidx.compose.ui.unit.Dp.m3671boximpl(f));
                getpostalcode.write(objComponentActivity);
            }
            getpostalcode.IconCompatParcelizer(false);
            getpostalcode.IconCompatParcelizer(false);
            androidx.compose.material3.SurfaceKt.m126SurfaceT9BRK9s(modifier3, shape3, j5, j6, 0.0f, ((androidx.compose.ui.unit.Dp) ((PopulateViewStructure_androidKtpopulate7) objComponentActivity).getValue()).m3687unboximpl(), positionVar3, coil3.ExtrasKt.write(-97109725, new r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0() { // from class: androidx.compose.material3.CardKt$Card$1
                /* JADX WARN: Code duplicated, block: B:18:0x0091  */
                @Override // o.r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0
                public final Object invoke(Object obj, Object obj2) {
                    getBirthDateFull getbirthdatefull2 = (getBirthDateFull) obj;
                    int iIntValue = ((Number) obj2).intValue();
                    getPostalCode getpostalcode2 = (getPostalCode) getbirthdatefull2;
                    if (getpostalcode2.write(iIntValue & 1, (iIntValue & 3) != 2)) {
                        Modifier.Companion companion = Modifier.Companion;
                        ModalBottomSheetYbuCTN8 modalBottomSheetYbuCTN8Serializer = ModalBottomSheetKtModalBottomSheet311.serializer(Arrangement.MediaDescriptionCompat, Alignment.Companion.getStart(), getpostalcode2, 0);
                        int iSerializer = SentryUUID.serializer(getpostalcode2);
                        DragAndDropNodestartDragAndDropTransfer1 dragAndDropNodestartDragAndDropTransfer1Serializer = getpostalcode2.serializer();
                        Modifier modifierMaterializeModifier = ComposedModifierKt.materializeModifier(getpostalcode2, companion);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.Companion;
                        r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 constructor = companion2.getConstructor();
                        if (getpostalcode2.read == null) {
                            SentryUUID.write();
                            throw null;
                        }
                        getpostalcode2.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg();
                        if (getpostalcode2.ComponentActivity) {
                            getpostalcode2.serializer(constructor);
                        } else {
                            getpostalcode2.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                        }
                        AndroidContentCaptureManagerCompanion.write(getpostalcode2, modalBottomSheetYbuCTN8Serializer, companion2.getSetMeasurePolicy());
                        AndroidContentCaptureManagerCompanion.write(getpostalcode2, dragAndDropNodestartDragAndDropTransfer1Serializer, companion2.getSetResolvedCompositionLocals());
                        r8lambdaa6_tctQMKSh3FK6HJGcbKuVdE0 setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (getpostalcode2.ComponentActivity) {
                            c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, setCompositeKeyHash);
                        } else {
                            if (!((Boolean) removeNodeAtDepth.RemoteActionCompatParcelizer(getCieXyz.write(), 1803334089, -1803334089, getCieXyz.write(), getCieXyz.write(), new Object[]{getpostalcode2.ComponentActivity(), Integer.valueOf(iSerializer)}, getCieXyz.write())).booleanValue()) {
                                c8$$ExternalSyntheticOutline0.m(iSerializer, getpostalcode2, iSerializer, setCompositeKeyHash);
                            }
                        }
                        AndroidContentCaptureManagerCompanion.write(getpostalcode2, modifierMaterializeModifier, companion2.getSetModifier());
                        dragAndDropTargetModifierNode.invoke(o.ModalBottomSheetKt.write, getpostalcode2, 6);
                        getpostalcode2.IconCompatParcelizer(true);
                    } else {
                        getpostalcode2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
                    }
                    return createFromParcel.INSTANCE;
                }
            }, getpostalcode), getpostalcode, (i12 & 14) | 12582912 | (i12 & 112) | ((i12 << 6) & 3670016), 16);
            SessionMutex sessionMutex6 = sessionMutexSerializer;
            sessionMutexSession2 = sessionMutexSession5;
            sessionMutex3 = sessionMutex6;
        } else {
            getpostalcode.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            modifier3 = modifier2;
            shape3 = shape2;
            sessionMutex3 = sessionMutex2;
            sessionMutexSession2 = sessionMutexSessionRemoteActionCompatParcelizer;
            positionVar3 = positionVar2;
        }
        gethandleruiannotationsMediaDescriptionCompat = getpostalcode.MediaDescriptionCompat();
        if (gethandleruiannotationsMediaDescriptionCompat != null) {
            gethandleruiannotationsMediaDescriptionCompat.serializer = new UiMediaScope(modifier3, shape3, sessionMutex3, sessionMutexSession2, positionVar3, dragAndDropTargetModifierNode, i, i2);
        }
    }
}
