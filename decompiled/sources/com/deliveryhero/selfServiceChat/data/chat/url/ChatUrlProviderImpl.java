package com.deliveryhero.selfServiceChat.data.chat.url;

import coil3.ExtrasKt;
import com.deliveryhero.customerchat.commons.UserNotRegisteredException;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import com.deliveryhero.selfServiceChat.data.chat.url.datastore.ChatUrlDataStoreHelperImpl;
import com.deliveryhero.selfServiceChat.domain.exceptions.CountryCodeNotSetException;
import com.deliveryhero.selfServiceChat.domain.exceptions.GlobalEntityNotSetException;
import com.deliveryhero.selfServiceChat.domain.exceptions.InvalidVerificationToken;
import com.deliveryhero.selfServiceChat.domain.exceptions.LocaleNotSetException;
import com.deliveryhero.selfServiceChat.domain.exceptions.OrderIDNotSetException;
import com.deliveryhero.selfServiceChat.domain.exceptions.UserTypeNotSetException;
import com.google.android.gms.internal.mlkit_vision_common.zzhk;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.YieldKt;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import o.LayerSnapshotV21;
import o.LayerSnapshot_androidKt;
import o.ShortNewsContentCardView;
import o.SurfaceUtils;
import o.VectorComposeKtPath26;
import o.VectorComposeKtPath27;
import o.VectorComposeKtPath28;
import o.VectorComposeKtPath29;
import o.VectorComposeKtPath3;
import o.VectorGroupiterator1;
import o.VectorPainter;
import o.ViewLayerVerificationHelper31;
import o.accessgetChildrenp;
import o.accessgetOrDefaultjd;
import o.applyLayoutDirection;
import o.createFromParcel;
import o.getBitmapConfig_sVssgQui;
import o.getCompositionui;
import o.getNameui;
import o.getSize;
import o.invokekLtJ_vA;
import o.prepareForActivityTransitionCarryover;
import o.r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0;
import o.resolveLockHardwareCanvasMethod;
import o.setOutlineAmbientShadowColor;
import o.validateSizeN5eqBDc;

/* JADX INFO: loaded from: classes2.dex */
public final class ChatUrlProviderImpl implements getBitmapConfig_sVssgQui {
    public final applyLayoutDirection IconCompatParcelizer;
    public final VectorPainter MediaSessionCompatQueueItem;
    public final getCompositionui RatingCompat;
    public final setOutlineAmbientShadowColor RemoteActionCompatParcelizer;
    public final VectorComposeKtPath28 read;
    public final VectorGroupiterator1 serializer;
    public final accessgetOrDefaultjd write;

    public ChatUrlProviderImpl(setOutlineAmbientShadowColor setoutlineambientshadowcolor, VectorComposeKtPath28 vectorComposeKtPath28, getCompositionui getcompositionui, VectorGroupiterator1 vectorGroupiterator1, accessgetOrDefaultjd accessgetordefaultjd, applyLayoutDirection applylayoutdirection, VectorPainter vectorPainter) {
        this.RemoteActionCompatParcelizer = setoutlineambientshadowcolor;
        this.read = vectorComposeKtPath28;
        this.RatingCompat = getcompositionui;
        this.serializer = vectorGroupiterator1;
        this.write = accessgetordefaultjd;
        this.IconCompatParcelizer = applylayoutdirection;
        this.MediaSessionCompatQueueItem = vectorPainter;
    }

    public static String serializer(r8lambdaRDpfSr94J4iEbcwX_KPqzPM8k0 r8lambdardpfsr94j4iebcwx_kpqzpm8k0) {
        return "Android_" + ((String) r8lambdardpfsr94j4iebcwx_kpqzpm8k0.invoke());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object fetchBaseChatUrl(ContinuationImpl continuationImpl) {
        VectorComposeKtPath29 vectorComposeKtPath29;
        SurfaceUtils surfaceUtils;
        String str;
        String str2;
        String str3;
        String strName;
        ChatUrlProviderImpl chatUrlProviderImpl;
        if (continuationImpl instanceof VectorComposeKtPath29) {
            vectorComposeKtPath29 = (VectorComposeKtPath29) continuationImpl;
            int i = vectorComposeKtPath29.write;
            if ((i & Integer.MIN_VALUE) != 0) {
                vectorComposeKtPath29.write = i - Integer.MIN_VALUE;
            } else {
                vectorComposeKtPath29 = new VectorComposeKtPath29(this, continuationImpl);
            }
        } else {
            vectorComposeKtPath29 = new VectorComposeKtPath29(this, continuationImpl);
        }
        Object objWithContext = vectorComposeKtPath29.serializer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = vectorComposeKtPath29.write;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
            String str4 = ((getSize) this.write).read;
            if (str4 != null && str4.length() != 0) {
                return str4;
            }
            vectorComposeKtPath29.IconCompatParcelizer = this;
            vectorComposeKtPath29.write = 1;
            LayerSnapshotV21 layerSnapshotV21Write = ((ViewLayerVerificationHelper31) this.RemoteActionCompatParcelizer).write();
            if (layerSnapshotV21Write != null && (surfaceUtils = layerSnapshotV21Write.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) != null && (str = surfaceUtils.dhAuthToken) != null) {
                String strSerializer = serializer(new VectorComposeKtPath26(this, 1));
                String strSerializer2 = serializer(new VectorComposeKtPath3(this, 1));
                String str5 = layerSnapshotV21Write.IconCompatParcelizer;
                if (str5 == null) {
                    str5 = "customer-rider-chat-user@mail.com";
                }
                String str6 = str5;
                LayerSnapshot_androidKt layerSnapshot_androidKt = layerSnapshotV21Write.write;
                if (layerSnapshot_androidKt != null && (str2 = layerSnapshot_androidKt.globalEntityID) != null) {
                    String str7 = layerSnapshotV21Write.RatingCompat;
                    if (str7 != null) {
                        String str8 = layerSnapshot_androidKt.country;
                        if (str8 != null) {
                            SurfaceUtils surfaceUtils2 = layerSnapshotV21Write.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                            if (surfaceUtils2 != null && (str3 = surfaceUtils2.id) != null) {
                                resolveLockHardwareCanvasMethod resolvelockhardwarecanvasmethod = layerSnapshot_androidKt.userType;
                                if (resolvelockhardwarecanvasmethod != null && (strName = resolvelockhardwarecanvasmethod.name()) != null) {
                                    String lowerCase = strName.toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                    String str9 = layerSnapshotV21Write.read().id;
                                    String strRemoteActionCompatParcelizer = layerSnapshotV21Write.RemoteActionCompatParcelizer();
                                    if (strRemoteActionCompatParcelizer != null) {
                                        String str10 = layerSnapshotV21Write.write().country;
                                        String str11 = layerSnapshotV21Write.MediaMetadataCompat;
                                        if (str11 == null) {
                                            str11 = "";
                                        }
                                        HelpcenterInitBasicRequestBody helpcenterInitBasicRequestBody = new HelpcenterInitBasicRequestBody(strSerializer, false, str6, str2, false, str7, str8, str3, str, "p2p", strSerializer2, str10, str, lowerCase, str9, strRemoteActionCompatParcelizer, str11);
                                        invokekLtJ_vA invokekltj_va = (invokekLtJ_vA) this.read;
                                        DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                                        objWithContext = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new HelpcenterChatUrlDataSourceImpl$fetchBasicUrlFromInitEndpoint$2(invokekltj_va, helpcenterInitBasicRequestBody, null), vectorComposeKtPath29);
                                        if (objWithContext == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        chatUrlProviderImpl = this;
                                    } else {
                                        throw InvalidVerificationToken.read;
                                    }
                                } else {
                                    throw UserTypeNotSetException.serializer;
                                }
                            } else {
                                throw new UserNotRegisteredException();
                            }
                        } else {
                            throw CountryCodeNotSetException.RemoteActionCompatParcelizer;
                        }
                    } else {
                        throw LocaleNotSetException.read;
                    }
                } else {
                    throw new GlobalEntityNotSetException("Web Chat URL");
                }
            } else {
                throw new UserNotRegisteredException();
            }
        } else if (i2 == 1) {
            chatUrlProviderImpl = vectorComposeKtPath29.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(objWithContext);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        String str12 = (String) objWithContext;
        ((getSize) chatUrlProviderImpl.write).read = str12;
        return str12;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00da  */
    /* JADX WARN: Code duplicated, block: B:65:0x010a  */
    /* JADX WARN: Code duplicated, block: B:67:0x011a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object fetchChatUrl(ContinuationImpl continuationImpl) throws Throwable {
        VectorComposeKtPath27 vectorComposeKtPath27;
        validateSizeN5eqBDc validatesizen5eqbdc;
        Object objCoroutineScope;
        ChatUrlProviderImpl chatUrlProviderImpl;
        validateSizeN5eqBDc validatesizen5eqbdc2;
        ChatUrlProviderImpl chatUrlProviderImpl2;
        accessgetChildrenp accessgetchildrenp;
        String str;
        LayerSnapshotV21 layerSnapshotV21Write;
        SurfaceUtils surfaceUtils;
        String str2;
        String str3;
        String str4;
        String strName;
        ChatUrlProviderImpl chatUrlProviderImpl3;
        String str5;
        ChatUrlProviderImpl chatUrlProviderImpl4;
        Object objCoroutineScope2;
        String str6;
        VectorGroupiterator1 vectorGroupiterator1;
        String str7;
        ChatUrlProviderImpl chatUrlProviderImpl5;
        if (continuationImpl instanceof VectorComposeKtPath27) {
            vectorComposeKtPath27 = (VectorComposeKtPath27) continuationImpl;
            int i = vectorComposeKtPath27.serializer;
            if ((i & Integer.MIN_VALUE) != 0) {
                vectorComposeKtPath27.serializer = i - Integer.MIN_VALUE;
            } else {
                vectorComposeKtPath27 = new VectorComposeKtPath27(this, continuationImpl);
            }
        } else {
            vectorComposeKtPath27 = new VectorComposeKtPath27(this, continuationImpl);
        }
        Object cachedChatURLConfig = vectorComposeKtPath27.RemoteActionCompatParcelizer;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = vectorComposeKtPath27.serializer;
        Object obj = createFromParcel.INSTANCE;
        int i3 = 0;
        int i4 = 1;
        ShortNewsContentCardView shortNewsContentCardView = null;
        if (i2 == 0) {
            ExtrasKt.RemoteActionCompatParcelizer(cachedChatURLConfig);
            LayerSnapshotV21 layerSnapshotV21Write2 = ((ViewLayerVerificationHelper31) this.RemoteActionCompatParcelizer).write();
            if (layerSnapshotV21Write2 != null) {
                LayerSnapshot_androidKt layerSnapshot_androidKt = layerSnapshotV21Write2.write;
                String strValueOf = String.valueOf(layerSnapshot_androidKt != null ? layerSnapshot_androidKt.globalEntityID : null);
                String strValueOf2 = String.valueOf(layerSnapshotV21Write2.ParcelableVolumeInfo);
                String strValueOf3 = String.valueOf(layerSnapshotV21Write2.read);
                SurfaceUtils surfaceUtils2 = layerSnapshotV21Write2.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                validatesizen5eqbdc = new validateSizeN5eqBDc(strValueOf, strValueOf2, strValueOf3, String.valueOf(surfaceUtils2 != null ? surfaceUtils2.id : null));
            } else {
                validatesizen5eqbdc = null;
            }
            vectorComposeKtPath27.IconCompatParcelizer = this;
            vectorComposeKtPath27.write = validatesizen5eqbdc;
            vectorComposeKtPath27.serializer = 1;
            if (validatesizen5eqbdc == null || (objCoroutineScope = YieldKt.coroutineScope(new ChatUrlProviderImpl$trackUrlFetch$2(this, validatesizen5eqbdc, shortNewsContentCardView, i3), vectorComposeKtPath27)) != coroutineSingletons) {
                objCoroutineScope = obj;
            }
            if (objCoroutineScope != coroutineSingletons) {
                chatUrlProviderImpl = this;
                validatesizen5eqbdc2 = validatesizen5eqbdc;
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    str5 = (String) vectorComposeKtPath27.write;
                    chatUrlProviderImpl4 = vectorComposeKtPath27.IconCompatParcelizer;
                    ExtrasKt.RemoteActionCompatParcelizer(cachedChatURLConfig);
                    return ((getNameui) chatUrlProviderImpl4.RatingCompat).write(str5);
                }
                if (i2 == 4) {
                    chatUrlProviderImpl3 = vectorComposeKtPath27.IconCompatParcelizer;
                    ExtrasKt.RemoteActionCompatParcelizer(cachedChatURLConfig);
                    str6 = (String) cachedChatURLConfig;
                    vectorGroupiterator1 = chatUrlProviderImpl3.serializer;
                    vectorComposeKtPath27.IconCompatParcelizer = chatUrlProviderImpl3;
                    vectorComposeKtPath27.write = str6;
                    vectorComposeKtPath27.serializer = 5;
                    if (zzhk.updateChatUrl$default(vectorGroupiterator1, str6, vectorComposeKtPath27) != coroutineSingletons) {
                        str7 = str6;
                        chatUrlProviderImpl5 = chatUrlProviderImpl3;
                    }
                    return coroutineSingletons;
                }
                if (i2 == 5) {
                    str7 = (String) vectorComposeKtPath27.write;
                    chatUrlProviderImpl5 = vectorComposeKtPath27.IconCompatParcelizer;
                    ExtrasKt.RemoteActionCompatParcelizer(cachedChatURLConfig);
                } else {
                    ScreenStartObserver$$ExternalSyntheticLambda0.write("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                return ((getNameui) chatUrlProviderImpl5.RatingCompat).write(str7);
            }
            validatesizen5eqbdc2 = (validateSizeN5eqBDc) vectorComposeKtPath27.write;
            chatUrlProviderImpl2 = vectorComposeKtPath27.IconCompatParcelizer;
            ExtrasKt.RemoteActionCompatParcelizer(cachedChatURLConfig);
            accessgetchildrenp = (accessgetChildrenp) cachedChatURLConfig;
            if (accessgetchildrenp != null) {
                str = accessgetchildrenp.url;
            } else {
                str = null;
            }
            if (str == null && str.length() != 0) {
                vectorComposeKtPath27.IconCompatParcelizer = chatUrlProviderImpl2;
                vectorComposeKtPath27.write = str;
                vectorComposeKtPath27.serializer = 3;
                chatUrlProviderImpl2.getClass();
                if (validatesizen5eqbdc2 != null && (objCoroutineScope2 = YieldKt.coroutineScope(new ChatUrlProviderImpl$trackUrlFetch$2(chatUrlProviderImpl2, validatesizen5eqbdc2, shortNewsContentCardView, i4), vectorComposeKtPath27)) == coroutineSingletons) {
                    obj = objCoroutineScope2;
                }
                if (obj != coroutineSingletons) {
                    str5 = str;
                    chatUrlProviderImpl4 = chatUrlProviderImpl2;
                    return ((getNameui) chatUrlProviderImpl4.RatingCompat).write(str5);
                }
            } else {
                vectorComposeKtPath27.IconCompatParcelizer = chatUrlProviderImpl2;
                vectorComposeKtPath27.write = null;
                vectorComposeKtPath27.serializer = 4;
                layerSnapshotV21Write = ((ViewLayerVerificationHelper31) chatUrlProviderImpl2.RemoteActionCompatParcelizer).write();
                if (layerSnapshotV21Write == null && (surfaceUtils = layerSnapshotV21Write.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus) != null && (str2 = surfaceUtils.dhAuthToken) != null) {
                    String strSerializer = serializer(new VectorComposeKtPath26(chatUrlProviderImpl2, 0));
                    String strSerializer2 = serializer(new VectorComposeKtPath3(chatUrlProviderImpl2, 0));
                    String str8 = layerSnapshotV21Write.IconCompatParcelizer;
                    if (str8 == null) {
                        str8 = "customer-rider-chat-user@mail.com";
                    }
                    String str9 = str8;
                    LayerSnapshot_androidKt layerSnapshot_androidKt2 = layerSnapshotV21Write.write;
                    if (layerSnapshot_androidKt2 != null && (str3 = layerSnapshot_androidKt2.globalEntityID) != null) {
                        String str10 = layerSnapshotV21Write.RatingCompat;
                        if (str10 != null) {
                            String str11 = layerSnapshot_androidKt2.country;
                            if (str11 != null) {
                                SurfaceUtils surfaceUtils3 = layerSnapshotV21Write.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
                                if (surfaceUtils3 != null && (str4 = surfaceUtils3.id) != null) {
                                    String str12 = layerSnapshotV21Write.ParcelableVolumeInfo;
                                    if (str12 != null) {
                                        resolveLockHardwareCanvasMethod resolvelockhardwarecanvasmethod = layerSnapshot_androidKt2.userType;
                                        if (resolvelockhardwarecanvasmethod != null && (strName = resolvelockhardwarecanvasmethod.name()) != null) {
                                            String lowerCase = strName.toLowerCase(Locale.ROOT);
                                            lowerCase.getClass();
                                            String str13 = layerSnapshotV21Write.read().id;
                                            String strRemoteActionCompatParcelizer = layerSnapshotV21Write.RemoteActionCompatParcelizer();
                                            if (strRemoteActionCompatParcelizer != null) {
                                                String str14 = layerSnapshotV21Write.write().country;
                                                String str15 = layerSnapshotV21Write.MediaMetadataCompat;
                                                if (str15 == null) {
                                                    str15 = "";
                                                }
                                                HelpcenterInitRequestBody helpcenterInitRequestBody = new HelpcenterInitRequestBody(strSerializer, true, str9, str3, false, str10, str11, str4, str12, str2, "p2p", strSerializer2, str14, str2, lowerCase, str13, strRemoteActionCompatParcelizer, str15);
                                                invokekLtJ_vA invokekltj_va = (invokekLtJ_vA) chatUrlProviderImpl2.read;
                                                DefaultScheduler defaultScheduler = prepareForActivityTransitionCarryover.RemoteActionCompatParcelizer;
                                                cachedChatURLConfig = BuildersKt.withContext(DefaultIoScheduler.RemoteActionCompatParcelizer, new HelpcenterChatUrlDataSourceImpl$fetchUrlFromInitEndpoint$2(invokekltj_va, helpcenterInitRequestBody, null), vectorComposeKtPath27);
                                                if (cachedChatURLConfig != coroutineSingletons) {
                                                    chatUrlProviderImpl3 = chatUrlProviderImpl2;
                                                    str6 = (String) cachedChatURLConfig;
                                                    vectorGroupiterator1 = chatUrlProviderImpl3.serializer;
                                                    vectorComposeKtPath27.IconCompatParcelizer = chatUrlProviderImpl3;
                                                    vectorComposeKtPath27.write = str6;
                                                    vectorComposeKtPath27.serializer = 5;
                                                    if (zzhk.updateChatUrl$default(vectorGroupiterator1, str6, vectorComposeKtPath27) != coroutineSingletons) {
                                                        str7 = str6;
                                                        chatUrlProviderImpl5 = chatUrlProviderImpl3;
                                                        return ((getNameui) chatUrlProviderImpl5.RatingCompat).write(str7);
                                                    }
                                                }
                                            } else {
                                                throw InvalidVerificationToken.read;
                                            }
                                        } else {
                                            throw UserTypeNotSetException.serializer;
                                        }
                                    } else {
                                        throw OrderIDNotSetException.read;
                                    }
                                } else {
                                    throw new UserNotRegisteredException();
                                }
                            } else {
                                throw CountryCodeNotSetException.RemoteActionCompatParcelizer;
                            }
                        } else {
                            throw LocaleNotSetException.read;
                        }
                    } else {
                        throw new GlobalEntityNotSetException("Web Chat URL");
                    }
                } else {
                    throw new UserNotRegisteredException();
                }
            }
            return coroutineSingletons;
        }
        validatesizen5eqbdc2 = (validateSizeN5eqBDc) vectorComposeKtPath27.write;
        chatUrlProviderImpl = vectorComposeKtPath27.IconCompatParcelizer;
        ExtrasKt.RemoteActionCompatParcelizer(cachedChatURLConfig);
        VectorGroupiterator1 vectorGroupiterator2 = chatUrlProviderImpl.serializer;
        vectorComposeKtPath27.IconCompatParcelizer = chatUrlProviderImpl;
        vectorComposeKtPath27.write = validatesizen5eqbdc2;
        vectorComposeKtPath27.serializer = 2;
        cachedChatURLConfig = ((ChatUrlDataStoreHelperImpl) vectorGroupiterator2).getCachedChatURLConfig(System.currentTimeMillis(), vectorComposeKtPath27);
        if (cachedChatURLConfig != coroutineSingletons) {
            chatUrlProviderImpl2 = chatUrlProviderImpl;
            accessgetchildrenp = (accessgetChildrenp) cachedChatURLConfig;
            if (accessgetchildrenp != null) {
                str = accessgetchildrenp.url;
            } else {
                str = null;
            }
            if (str == null) {
                vectorComposeKtPath27.IconCompatParcelizer = chatUrlProviderImpl2;
                vectorComposeKtPath27.write = null;
                vectorComposeKtPath27.serializer = 4;
                layerSnapshotV21Write = ((ViewLayerVerificationHelper31) chatUrlProviderImpl2.RemoteActionCompatParcelizer).write();
                if (layerSnapshotV21Write == null) {
                }
                throw new UserNotRegisteredException();
            }
            vectorComposeKtPath27.IconCompatParcelizer = chatUrlProviderImpl2;
            vectorComposeKtPath27.write = null;
            vectorComposeKtPath27.serializer = 4;
            layerSnapshotV21Write = ((ViewLayerVerificationHelper31) chatUrlProviderImpl2.RemoteActionCompatParcelizer).write();
            if (layerSnapshotV21Write == null) {
            }
            throw new UserNotRegisteredException();
        }
        return coroutineSingletons;
    }
}
