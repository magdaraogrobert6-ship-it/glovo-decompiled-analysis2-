package o;

import bo.app.ff$$ExternalSyntheticOutline0;
import com.deliveryhero.fwf_http.ConstantKt;
import io.grpc.LoadBalancer$Helper;
import io.sentry.util.UrlUtils;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CancellableContinuationImpl;
import o.ProtoClauseMsg;
import o.ShortNewsContentCardView;
import o.accessgetchildSerializerscp;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.syncCustomerProfile;
import o.useEvaluationsCache;
import o.writeSelffwf_client_release;
import okio.Options;

/* JADX INFO: loaded from: classes4.dex */
public abstract class startCoroutineTimer {
    public final getMessageImageView IconCompatParcelizer;
    public final FwFClientKt RemoteActionCompatParcelizer;
    public final accessgetHoldouts write;

    public abstract Object adapt(writeSelffwf_client_release writeselffwf_client_release, Object[] objArr);

    public startCoroutineTimer(accessgetHoldouts accessgetholdouts, getMessageImageView getmessageimageview, FwFClientKt fwFClientKt) {
        this.write = accessgetholdouts;
        this.IconCompatParcelizer = getmessageimageview;
        this.RemoteActionCompatParcelizer = fwFClientKt;
    }

    /* JADX WARN: Code duplicated, block: B:389:0x0909 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:390:0x090b  */
    /* JADX WARN: Code duplicated, block: B:594:0x0920 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:601:0x090d A[SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static startCoroutineTimer IconCompatParcelizer(getHoldoutVariation getholdoutvariation, Class cls, Method method) {
        Type genericReturnType;
        boolean z;
        boolean z2;
        Annotation[][] annotationArr;
        int i;
        String str;
        int i2;
        LazyKt__LazyJVMKt[] lazyKt__LazyJVMKtArr;
        LazyKt__LazyJVMKt lazyKt__LazyJVMKt;
        int i3;
        int i4;
        String str2;
        LazyKt__LazyJVMKt[] lazyKt__LazyJVMKtArr2;
        LazyKt__LazyJVMKt protoCustomerProfileMsgCompanion;
        LazyKt__LazyJVMKt protoErrorCodeCompanion;
        LazyKt__LazyJVMKt protoErrorCode;
        LazyKt__LazyJVMKt protoCustomerProfileMsg;
        ProtoClauseMsgserializer protoClauseMsgserializer;
        LazyKt__LazyJVMKt protoCustomerProfileMsgserializer;
        getEvalUserId getevaluserid = new getEvalUserId(getholdoutvariation, cls, method);
        Annotation[] annotationArr2 = getevaluserid.r8lambda7aWCLmlNPTirEoC8eOYg0rEvmus;
        int length = annotationArr2.length;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            String str3 = "HEAD";
            int i7 = 1;
            if (i6 < length) {
                Annotation annotation = annotationArr2[i6];
                if (annotation instanceof getAsHoldout) {
                    getevaluserid.write("DELETE", ((getAsHoldout) annotation).read(), false);
                } else if (annotation instanceof getEvalNonAuth) {
                    getevaluserid.write("GET", ((getEvalNonAuth) annotation).IconCompatParcelizer(), false);
                } else if (annotation instanceof ProtoHoldoutMsgserializer) {
                    getevaluserid.write("HEAD", ((ProtoHoldoutMsgserializer) annotation).read(), false);
                } else if (annotation instanceof ProtoListValue) {
                    getevaluserid.write("PATCH", ((ProtoListValue) annotation).RemoteActionCompatParcelizer(), true);
                } else if (annotation instanceof ProtoParserKtdecodeProtoAndCachedecodedResponse1) {
                    getevaluserid.write("POST", ((ProtoParserKtdecodeProtoAndCachedecodedResponse1) annotation).RemoteActionCompatParcelizer(), true);
                } else if (annotation instanceof ProtoParserKtdecodeProtoAndCache1) {
                    getevaluserid.write("PUT", ((ProtoParserKtdecodeProtoAndCache1) annotation).IconCompatParcelizer(), true);
                } else if (annotation instanceof ProtoParserKt) {
                    getevaluserid.write("OPTIONS", ((ProtoParserKt) annotation).read(), false);
                } else if (annotation instanceof getEndDate) {
                    getEndDate getenddate = (getEndDate) annotation;
                    getevaluserid.write(getenddate.IconCompatParcelizer(), getenddate.write(), getenddate.read());
                } else if (annotation instanceof ProtoListValueCompanion) {
                    ProtoListValueCompanion protoListValueCompanion = (ProtoListValueCompanion) annotation;
                    String[] strArrSerializer = protoListValueCompanion.serializer();
                    if (strArrSerializer.length != 0) {
                        boolean z3 = protoListValueCompanion.read();
                        applyDisplayCutoutMarginsToContentArealambda0 applydisplaycutoutmarginstocontentarealambda0 = new applyDisplayCutoutMarginsToContentArealambda0((byte) 0, 0);
                        for (String str4 : strArrSerializer) {
                            int iIndexOf = str4.indexOf(58);
                            if (iIndexOf != -1 && iIndexOf != 0 && iIndexOf != str4.length() - 1) {
                                String strSubstring = str4.substring(0, iIndexOf);
                                String strTrim = str4.substring(iIndexOf + 1).trim();
                                if (ConstantKt.CONTENT_TYPE_HEADER.equalsIgnoreCase(strSubstring)) {
                                    try {
                                        getInAppMessageEventMap getinappmessageeventmap = InAppMessageHtmlBaseView.TYPE_SUBTYPE;
                                        getevaluserid.read = androidx.sqlite.SQLite.write(strTrim);
                                    } catch (IllegalArgumentException e) {
                                        throw getKind.read(method, e, "Malformed content type: %s", strTrim);
                                    }
                                } else if (z3) {
                                    applydisplaycutoutmarginstocontentarealambda0.RemoteActionCompatParcelizer(strSubstring, strTrim);
                                } else {
                                    applydisplaycutoutmarginstocontentarealambda0.write(strSubstring, strTrim);
                                }
                            } else {
                                throw getKind.read(method, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str4);
                            }
                        }
                        getevaluserid.ParcelableVolumeInfo = applydisplaycutoutmarginstocontentarealambda0.read();
                    } else {
                        throw getKind.read(method, null, "@Headers annotation is empty.", new Object[0]);
                    }
                } else if (annotation instanceof ProtoListValueserializer) {
                    if (!getevaluserid.PlaybackStateCompat) {
                        getevaluserid.r8lambda54BeH8ZsBru0CXI2CCSP2syNys = true;
                    } else {
                        throw getKind.read(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                    }
                } else if (!(annotation instanceof ProtoHoldoutMsgCompanion)) {
                    continue;
                } else if (!getevaluserid.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                    getevaluserid.PlaybackStateCompat = true;
                } else {
                    throw getKind.read(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                i6++;
            } else {
                if (getevaluserid.MediaSessionCompatToken != null) {
                    if (!getevaluserid.PlaybackStateCompatCustomAction) {
                        if (!getevaluserid.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                            if (getevaluserid.PlaybackStateCompat) {
                                throw getKind.read(method, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                            }
                        } else {
                            throw getKind.read(method, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                        }
                    }
                    Annotation[][] annotationArr3 = getevaluserid.ComponentActivity;
                    int length2 = annotationArr3.length;
                    getevaluserid.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4 = new LazyKt__LazyJVMKt[length2];
                    int i8 = length2 - 1;
                    int i9 = 0;
                    while (i9 < length2) {
                        LazyKt__LazyJVMKt[] lazyKt__LazyJVMKtArr3 = getevaluserid.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4;
                        Type type = getevaluserid.r8lambdaXCwb6u5X87zpWrZW4Zmu6tsKQC8[i9];
                        Annotation[] annotationArr4 = annotationArr3[i9];
                        int i10 = i9 == i8 ? i7 : i5;
                        if (annotationArr4 != null) {
                            int length3 = annotationArr4.length;
                            lazyKt__LazyJVMKt = null;
                            while (i5 < length3) {
                                Annotation annotation2 = annotationArr4[i5];
                                Annotation[][] annotationArr5 = annotationArr3;
                                int i11 = length2;
                                if (annotation2 instanceof ProtoRolloutMsg) {
                                    getevaluserid.RemoteActionCompatParcelizer(i9, type);
                                    if (!getevaluserid.MediaSessionCompatResultReceiverWrapper) {
                                        if (!getevaluserid.MediaBrowserCompatMediaItem) {
                                            if (!getevaluserid.RatingCompat) {
                                                if (!getevaluserid.MediaSessionCompatQueueItem) {
                                                    if (!getevaluserid.MediaMetadataCompat) {
                                                        if (getevaluserid.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == null) {
                                                            getevaluserid.MediaSessionCompatResultReceiverWrapper = true;
                                                            if (type != setInAppMessageImageViewAttributes.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                                                throw getKind.IconCompatParcelizer(method, i9, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                                            }
                                                            protoCustomerProfileMsgserializer = new ProtoErrorMsg(method, i9);
                                                            i3 = i8;
                                                        } else {
                                                            throw getKind.IconCompatParcelizer(method, i9, "@Url cannot be used with @%s URL", getevaluserid.MediaSessionCompatToken);
                                                        }
                                                    } else {
                                                        throw getKind.IconCompatParcelizer(method, i9, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                                    }
                                                } else {
                                                    throw getKind.IconCompatParcelizer(method, i9, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                                }
                                            } else {
                                                throw getKind.IconCompatParcelizer(method, i9, "A @Url parameter must not come after a @Query.", new Object[0]);
                                            }
                                        } else {
                                            throw getKind.IconCompatParcelizer(method, i9, "@Path parameters may not be used with @Url.", new Object[0]);
                                        }
                                    } else {
                                        throw getKind.IconCompatParcelizer(method, i9, "Multiple @Url method annotations found.", new Object[0]);
                                    }
                                } else {
                                    boolean z4 = annotation2 instanceof decodeProtoAndCache;
                                    i3 = i8;
                                    getHoldoutVariation getholdoutvariation2 = getevaluserid.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
                                    if (z4) {
                                        getevaluserid.RemoteActionCompatParcelizer(i9, type);
                                        if (!getevaluserid.RatingCompat) {
                                            if (!getevaluserid.MediaSessionCompatQueueItem) {
                                                if (!getevaluserid.MediaMetadataCompat) {
                                                    if (!getevaluserid.MediaSessionCompatResultReceiverWrapper) {
                                                        if (getevaluserid.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss != null) {
                                                            getevaluserid.MediaBrowserCompatMediaItem = true;
                                                            decodeProtoAndCache decodeprotoandcache = (decodeProtoAndCache) annotation2;
                                                            String strIconCompatParcelizer = decodeprotoandcache.IconCompatParcelizer();
                                                            if (getEvalUserId.serializer.matcher(strIconCompatParcelizer).matches()) {
                                                                if (getevaluserid.r8lambdaQUUwrpYSdd6n6dD7wrAaa0S4oXg.contains(strIconCompatParcelizer)) {
                                                                    getholdoutvariation2.read(type, annotationArr4);
                                                                    protoCustomerProfileMsgserializer = new ProtoCustomerProfileMsgserializer(getevaluserid.ResultReceiver, i9, strIconCompatParcelizer, decodeprotoandcache.RemoteActionCompatParcelizer());
                                                                } else {
                                                                    throw getKind.IconCompatParcelizer(method, i9, "URL \"%s\" does not contain \"{%s}\".", getevaluserid.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss, strIconCompatParcelizer);
                                                                }
                                                            } else {
                                                                throw getKind.IconCompatParcelizer(method, i9, "@Path parameter name must match %s. Found: %s", getEvalUserId.IconCompatParcelizer.pattern(), strIconCompatParcelizer);
                                                            }
                                                        } else {
                                                            throw getKind.IconCompatParcelizer(method, i9, "@Path can only be used with relative url on @%s", getevaluserid.MediaSessionCompatToken);
                                                        }
                                                    } else {
                                                        throw getKind.IconCompatParcelizer(method, i9, "@Path parameters may not be used with @Url.", new Object[0]);
                                                    }
                                                } else {
                                                    throw getKind.IconCompatParcelizer(method, i9, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                                }
                                            } else {
                                                throw getKind.IconCompatParcelizer(method, i9, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                            }
                                        } else {
                                            throw getKind.IconCompatParcelizer(method, i9, "A @Path parameter must not come after a @Query.", new Object[0]);
                                        }
                                    } else {
                                        i4 = length3;
                                        if (annotation2 instanceof getFeatureKey) {
                                            getevaluserid.RemoteActionCompatParcelizer(i9, type);
                                            getFeatureKey getfeaturekey = (getFeatureKey) annotation2;
                                            String strRemoteActionCompatParcelizer = getfeaturekey.RemoteActionCompatParcelizer();
                                            boolean zWrite = getfeaturekey.write();
                                            str2 = str3;
                                            Class clsWrite = getKind.write(type);
                                            getevaluserid.RatingCompat = true;
                                            if (Iterable.class.isAssignableFrom(clsWrite)) {
                                                if (type instanceof ParameterizedType) {
                                                    getholdoutvariation2.read(getKind.read(0, (ParameterizedType) type), annotationArr4);
                                                    protoErrorCode = new ProtoClauseMsgserializer(new ProtoDataError(strRemoteActionCompatParcelizer, 0, zWrite), 0);
                                                } else {
                                                    throw getKind.IconCompatParcelizer(method, i9, clsWrite.getSimpleName() + " must include generic type (e.g., " + clsWrite.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                            } else if (clsWrite.isArray()) {
                                                getholdoutvariation2.read(getEvalUserId.write(clsWrite.getComponentType()), annotationArr4);
                                                protoErrorCode = new ProtoClauseMsgserializer(new ProtoDataError(strRemoteActionCompatParcelizer, 0, zWrite), 1);
                                            } else {
                                                getholdoutvariation2.read(type, annotationArr4);
                                                protoErrorCode = new ProtoDataError(strRemoteActionCompatParcelizer, 0, zWrite);
                                            }
                                        } else {
                                            str2 = str3;
                                            if (annotation2 instanceof getExpectedVariation) {
                                                getevaluserid.RemoteActionCompatParcelizer(i9, type);
                                                boolean zIconCompatParcelizer = ((getExpectedVariation) annotation2).IconCompatParcelizer();
                                                Class clsWrite2 = getKind.write(type);
                                                getevaluserid.MediaSessionCompatQueueItem = true;
                                                if (Iterable.class.isAssignableFrom(clsWrite2)) {
                                                    if (type instanceof ParameterizedType) {
                                                        getholdoutvariation2.read(getKind.read(0, (ParameterizedType) type), annotationArr4);
                                                        protoClauseMsgserializer = new ProtoClauseMsgserializer(new ProtoErrorMsgserializer(zIconCompatParcelizer), 0);
                                                    } else {
                                                        throw getKind.IconCompatParcelizer(method, i9, clsWrite2.getSimpleName() + " must include generic type (e.g., " + clsWrite2.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                } else if (clsWrite2.isArray()) {
                                                    getholdoutvariation2.read(getEvalUserId.write(clsWrite2.getComponentType()), annotationArr4);
                                                    protoClauseMsgserializer = new ProtoClauseMsgserializer(new ProtoErrorMsgserializer(zIconCompatParcelizer), 1);
                                                } else {
                                                    getholdoutvariation2.read(type, annotationArr4);
                                                    protoErrorCode = new ProtoErrorMsgserializer(zIconCompatParcelizer);
                                                }
                                                protoErrorCode = protoClauseMsgserializer;
                                            } else if (annotation2 instanceof getAsPrerequisite) {
                                                getevaluserid.RemoteActionCompatParcelizer(i9, type);
                                                Class clsWrite3 = getKind.write(type);
                                                getevaluserid.MediaMetadataCompat = true;
                                                if (Map.class.isAssignableFrom(clsWrite3)) {
                                                    Type typeIconCompatParcelizer = getKind.IconCompatParcelizer(type, clsWrite3);
                                                    if (typeIconCompatParcelizer instanceof ParameterizedType) {
                                                        ParameterizedType parameterizedType = (ParameterizedType) typeIconCompatParcelizer;
                                                        Type type2 = getKind.read(0, parameterizedType);
                                                        if (String.class == type2) {
                                                            getholdoutvariation2.read(getKind.read(1, parameterizedType), annotationArr4);
                                                            protoErrorCode = new ProtoErrorCode(method, i9, ((getAsPrerequisite) annotation2).serializer(), 2);
                                                        } else {
                                                            throw getKind.IconCompatParcelizer(method, i9, "@QueryMap keys must be of type String: " + type2, new Object[0]);
                                                        }
                                                    } else {
                                                        throw getKind.IconCompatParcelizer(method, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                } else {
                                                    throw getKind.IconCompatParcelizer(method, i9, "@QueryMap parameter type must be Map.", new Object[0]);
                                                }
                                            } else if (annotation2 instanceof getClauses) {
                                                getevaluserid.RemoteActionCompatParcelizer(i9, type);
                                                getClauses getclauses = (getClauses) annotation2;
                                                String strSerializer = getclauses.serializer();
                                                Class clsWrite4 = getKind.write(type);
                                                if (Iterable.class.isAssignableFrom(clsWrite4)) {
                                                    if (type instanceof ParameterizedType) {
                                                        getholdoutvariation2.read(getKind.read(0, (ParameterizedType) type), annotationArr4);
                                                        protoCustomerProfileMsgCompanion = new ProtoClauseMsgserializer(new ProtoDataError(strSerializer, 1, getclauses.write()), 0);
                                                    } else {
                                                        throw getKind.IconCompatParcelizer(method, i9, clsWrite4.getSimpleName() + " must include generic type (e.g., " + clsWrite4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                } else if (clsWrite4.isArray()) {
                                                    getholdoutvariation2.read(getEvalUserId.write(clsWrite4.getComponentType()), annotationArr4);
                                                    protoCustomerProfileMsgCompanion = new ProtoClauseMsgserializer(new ProtoDataError(strSerializer, 1, getclauses.write()), 1);
                                                    lazyKt__LazyJVMKtArr2 = lazyKt__LazyJVMKtArr3;
                                                } else {
                                                    getholdoutvariation2.read(type, annotationArr4);
                                                    protoCustomerProfileMsg = new ProtoDataError(strSerializer, 1, getclauses.write());
                                                    protoCustomerProfileMsgCompanion = protoCustomerProfileMsg;
                                                }
                                                lazyKt__LazyJVMKtArr2 = lazyKt__LazyJVMKtArr3;
                                            } else if (annotation2 instanceof toList) {
                                                if (type == resetMessageMarginslambda00.class) {
                                                    protoCustomerProfileMsgCompanion = new getProfileAttributes(method, i9);
                                                } else {
                                                    getevaluserid.RemoteActionCompatParcelizer(i9, type);
                                                    Class clsWrite5 = getKind.write(type);
                                                    if (Map.class.isAssignableFrom(clsWrite5)) {
                                                        Type typeIconCompatParcelizer2 = getKind.IconCompatParcelizer(type, clsWrite5);
                                                        if (typeIconCompatParcelizer2 instanceof ParameterizedType) {
                                                            ParameterizedType parameterizedType2 = (ParameterizedType) typeIconCompatParcelizer2;
                                                            Type type3 = getKind.read(0, parameterizedType2);
                                                            if (String.class == type3) {
                                                                getholdoutvariation2.read(getKind.read(1, parameterizedType2), annotationArr4);
                                                                protoCustomerProfileMsg = new ProtoErrorCode(method, i9, ((toList) annotation2).serializer(), 1);
                                                                protoCustomerProfileMsgCompanion = protoCustomerProfileMsg;
                                                            } else {
                                                                throw getKind.IconCompatParcelizer(method, i9, "@HeaderMap keys must be of type String: " + type3, new Object[0]);
                                                            }
                                                        } else {
                                                            throw getKind.IconCompatParcelizer(method, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                        }
                                                    } else {
                                                        throw getKind.IconCompatParcelizer(method, i9, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                }
                                                lazyKt__LazyJVMKtArr2 = lazyKt__LazyJVMKtArr3;
                                            } else {
                                                if (annotation2 instanceof ProtoHoldoutMsg) {
                                                    getevaluserid.RemoteActionCompatParcelizer(i9, type);
                                                    if (getevaluserid.PlaybackStateCompat) {
                                                        ProtoHoldoutMsg protoHoldoutMsg = (ProtoHoldoutMsg) annotation2;
                                                        String strWrite = protoHoldoutMsg.write();
                                                        boolean zRemoteActionCompatParcelizer = protoHoldoutMsg.RemoteActionCompatParcelizer();
                                                        getevaluserid.RemoteActionCompatParcelizer = true;
                                                        Class clsWrite6 = getKind.write(type);
                                                        if (Iterable.class.isAssignableFrom(clsWrite6)) {
                                                            if (type instanceof ParameterizedType) {
                                                                getholdoutvariation2.read(getKind.read(0, (ParameterizedType) type), annotationArr4);
                                                                protoCustomerProfileMsgCompanion = new ProtoClauseMsgserializer(new ProtoCustomerProfileMsg(strWrite, zRemoteActionCompatParcelizer), 0);
                                                            } else {
                                                                throw getKind.IconCompatParcelizer(method, i9, clsWrite6.getSimpleName() + " must include generic type (e.g., " + clsWrite6.getSimpleName() + "<String>)", new Object[0]);
                                                            }
                                                        } else if (clsWrite6.isArray()) {
                                                            getholdoutvariation2.read(getEvalUserId.write(clsWrite6.getComponentType()), annotationArr4);
                                                            protoCustomerProfileMsgCompanion = new ProtoClauseMsgserializer(new ProtoCustomerProfileMsg(strWrite, zRemoteActionCompatParcelizer), 1);
                                                            lazyKt__LazyJVMKtArr2 = lazyKt__LazyJVMKtArr3;
                                                        } else {
                                                            getholdoutvariation2.read(type, annotationArr4);
                                                            protoCustomerProfileMsg = new ProtoCustomerProfileMsg(strWrite, zRemoteActionCompatParcelizer);
                                                            protoCustomerProfileMsgCompanion = protoCustomerProfileMsg;
                                                        }
                                                    } else {
                                                        throw getKind.IconCompatParcelizer(method, i9, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                    }
                                                } else if (annotation2 instanceof ProtoFeaturesMsgserializer) {
                                                    getevaluserid.RemoteActionCompatParcelizer(i9, type);
                                                    if (getevaluserid.PlaybackStateCompat) {
                                                        Class clsWrite7 = getKind.write(type);
                                                        if (Map.class.isAssignableFrom(clsWrite7)) {
                                                            Type typeIconCompatParcelizer3 = getKind.IconCompatParcelizer(type, clsWrite7);
                                                            if (typeIconCompatParcelizer3 instanceof ParameterizedType) {
                                                                ParameterizedType parameterizedType3 = (ParameterizedType) typeIconCompatParcelizer3;
                                                                int i12 = 0;
                                                                Type type4 = getKind.read(0, parameterizedType3);
                                                                if (String.class == type4) {
                                                                    getholdoutvariation2.read(getKind.read(1, parameterizedType3), annotationArr4);
                                                                    getevaluserid.RemoteActionCompatParcelizer = true;
                                                                    protoErrorCode = new ProtoErrorCode(method, i9, ((ProtoFeaturesMsgserializer) annotation2).write(), i12);
                                                                } else {
                                                                    throw getKind.IconCompatParcelizer(method, i9, "@FieldMap keys must be of type String: " + type4, new Object[0]);
                                                                }
                                                            } else {
                                                                throw getKind.IconCompatParcelizer(method, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                            }
                                                        } else {
                                                            throw getKind.IconCompatParcelizer(method, i9, "@FieldMap parameter type must be Map.", new Object[0]);
                                                        }
                                                    } else {
                                                        throw getKind.IconCompatParcelizer(method, i9, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                    }
                                                } else if (annotation2 instanceof ProtoParticipantsCompanion) {
                                                    getevaluserid.RemoteActionCompatParcelizer(i9, type);
                                                    if (getevaluserid.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                                                        ProtoParticipantsCompanion protoParticipantsCompanion = (ProtoParticipantsCompanion) annotation2;
                                                        getevaluserid.MediaDescriptionCompat = true;
                                                        String strRemoteActionCompatParcelizer2 = protoParticipantsCompanion.RemoteActionCompatParcelizer();
                                                        Class clsWrite8 = getKind.write(type);
                                                        if (strRemoteActionCompatParcelizer2.isEmpty()) {
                                                            boolean zIsAssignableFrom = Iterable.class.isAssignableFrom(clsWrite8);
                                                            ProtoErrorCodeCompanion1 protoErrorCodeCompanion1 = ProtoErrorCodeCompanion1.write;
                                                            if (zIsAssignableFrom) {
                                                                if (type instanceof ParameterizedType) {
                                                                    int i13 = 0;
                                                                    if (r8lambdaCTegLFIY2N5eeYL50pY32CICZRI.class.isAssignableFrom(getKind.write(getKind.read(0, (ParameterizedType) type)))) {
                                                                        protoCustomerProfileMsgCompanion = new ProtoClauseMsgserializer(protoErrorCodeCompanion1, i13);
                                                                    } else {
                                                                        throw getKind.IconCompatParcelizer(method, i9, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                                    }
                                                                } else {
                                                                    throw getKind.IconCompatParcelizer(method, i9, clsWrite8.getSimpleName() + " must include generic type (e.g., " + clsWrite8.getSimpleName() + "<String>)", new Object[0]);
                                                                }
                                                            } else if (clsWrite8.isArray()) {
                                                                if (r8lambdaCTegLFIY2N5eeYL50pY32CICZRI.class.isAssignableFrom(clsWrite8.getComponentType())) {
                                                                    protoCustomerProfileMsgCompanion = new ProtoClauseMsgserializer(protoErrorCodeCompanion1, 1);
                                                                } else {
                                                                    throw getKind.IconCompatParcelizer(method, i9, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                                }
                                                            } else {
                                                                if (!r8lambdaCTegLFIY2N5eeYL50pY32CICZRI.class.isAssignableFrom(clsWrite8)) {
                                                                    throw getKind.IconCompatParcelizer(method, i9, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                                }
                                                                protoCustomerProfileMsgCompanion = protoErrorCodeCompanion1;
                                                            }
                                                        } else {
                                                            lazyKt__LazyJVMKtArr2 = lazyKt__LazyJVMKtArr3;
                                                            String[] strArr = {"Content-Disposition", ff$$ExternalSyntheticOutline0.m("form-data; name=\"", strRemoteActionCompatParcelizer2, "\""), "Content-Transfer-Encoding", protoParticipantsCompanion.read()};
                                                            resetMessageMarginslambda00 resetmessagemarginslambda00 = resetMessageMarginslambda00.EMPTY;
                                                            resetMessageMarginslambda00 resetmessagemarginslambda00Serializer = Options.Companion.serializer(strArr);
                                                            if (Iterable.class.isAssignableFrom(clsWrite8)) {
                                                                if (type instanceof ParameterizedType) {
                                                                    int i14 = 0;
                                                                    Type type5 = getKind.read(0, (ParameterizedType) type);
                                                                    if (!r8lambdaCTegLFIY2N5eeYL50pY32CICZRI.class.isAssignableFrom(getKind.write(type5))) {
                                                                        protoCustomerProfileMsgCompanion = new ProtoClauseMsgserializer(new ProtoCustomerProfileMsgCompanion(method, i9, resetmessagemarginslambda00Serializer, getholdoutvariation2.serializer(type5, annotationArr4, annotationArr2)), i14);
                                                                    } else {
                                                                        throw getKind.IconCompatParcelizer(method, i9, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                                    }
                                                                } else {
                                                                    throw getKind.IconCompatParcelizer(method, i9, clsWrite8.getSimpleName() + " must include generic type (e.g., " + clsWrite8.getSimpleName() + "<String>)", new Object[0]);
                                                                }
                                                            } else if (clsWrite8.isArray()) {
                                                                Class clsWrite9 = getEvalUserId.write(clsWrite8.getComponentType());
                                                                if (!r8lambdaCTegLFIY2N5eeYL50pY32CICZRI.class.isAssignableFrom(clsWrite9)) {
                                                                    protoCustomerProfileMsgCompanion = new ProtoClauseMsgserializer(new ProtoCustomerProfileMsgCompanion(method, i9, resetmessagemarginslambda00Serializer, getholdoutvariation2.serializer(clsWrite9, annotationArr4, annotationArr2)), 1);
                                                                } else {
                                                                    throw getKind.IconCompatParcelizer(method, i9, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                                }
                                                            } else if (!r8lambdaCTegLFIY2N5eeYL50pY32CICZRI.class.isAssignableFrom(clsWrite8)) {
                                                                protoCustomerProfileMsgCompanion = new ProtoCustomerProfileMsgCompanion(method, i9, resetmessagemarginslambda00Serializer, getholdoutvariation2.serializer(type, annotationArr4, annotationArr2));
                                                            } else {
                                                                throw getKind.IconCompatParcelizer(method, i9, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                            }
                                                        }
                                                    } else {
                                                        throw getKind.IconCompatParcelizer(method, i9, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                    }
                                                } else {
                                                    lazyKt__LazyJVMKtArr2 = lazyKt__LazyJVMKtArr3;
                                                    if (annotation2 instanceof ProtoParticipants) {
                                                        getevaluserid.RemoteActionCompatParcelizer(i9, type);
                                                        if (getevaluserid.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                                                            getevaluserid.MediaDescriptionCompat = true;
                                                            Class clsWrite10 = getKind.write(type);
                                                            if (Map.class.isAssignableFrom(clsWrite10)) {
                                                                Type typeIconCompatParcelizer4 = getKind.IconCompatParcelizer(type, clsWrite10);
                                                                if (typeIconCompatParcelizer4 instanceof ParameterizedType) {
                                                                    ParameterizedType parameterizedType4 = (ParameterizedType) typeIconCompatParcelizer4;
                                                                    Type type6 = getKind.read(0, parameterizedType4);
                                                                    if (String.class == type6) {
                                                                        Type type7 = getKind.read(1, parameterizedType4);
                                                                        if (!r8lambdaCTegLFIY2N5eeYL50pY32CICZRI.class.isAssignableFrom(getKind.write(type7))) {
                                                                            protoCustomerProfileMsgCompanion = new ProtoCustomerProfileMsgCompanion(method, i9, getholdoutvariation2.serializer(type7, annotationArr4, annotationArr2), ((ProtoParticipants) annotation2).RemoteActionCompatParcelizer());
                                                                        } else {
                                                                            throw getKind.IconCompatParcelizer(method, i9, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                                        }
                                                                    } else {
                                                                        throw getKind.IconCompatParcelizer(method, i9, "@PartMap keys must be of type String: " + type6, new Object[0]);
                                                                    }
                                                                } else {
                                                                    throw getKind.IconCompatParcelizer(method, i9, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                                }
                                                            } else {
                                                                throw getKind.IconCompatParcelizer(method, i9, "@PartMap parameter type must be Map.", new Object[0]);
                                                            }
                                                        } else {
                                                            throw getKind.IconCompatParcelizer(method, i9, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                        }
                                                    } else {
                                                        if (annotation2 instanceof ProtoFeaturesMsgCompanion) {
                                                            getevaluserid.RemoteActionCompatParcelizer(i9, type);
                                                            if (!getevaluserid.PlaybackStateCompat && !getevaluserid.r8lambda54BeH8ZsBru0CXI2CCSP2syNys) {
                                                                if (!getevaluserid.write) {
                                                                    try {
                                                                        FwFClientKt fwFClientKtSerializer = getholdoutvariation2.serializer(type, annotationArr4, annotationArr2);
                                                                        getevaluserid.write = true;
                                                                        protoErrorCodeCompanion = new ProtoClauseMsgCompanion(method, i9, fwFClientKtSerializer);
                                                                    } catch (RuntimeException e2) {
                                                                        throw getKind.IconCompatParcelizer(method, e2, i9, "Unable to create @Body converter for %s", type);
                                                                    }
                                                                } else {
                                                                    throw getKind.IconCompatParcelizer(method, i9, "Multiple @Body method annotations found.", new Object[0]);
                                                                }
                                                            } else {
                                                                throw getKind.IconCompatParcelizer(method, i9, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                            }
                                                        } else if (annotation2 instanceof ProtoParticipantsCompanion1) {
                                                            getevaluserid.RemoteActionCompatParcelizer(i9, type);
                                                            Class clsWrite11 = getEvalUserId.write(getKind.write(type));
                                                            for (int i15 = i9 - 1; i15 >= 0; i15--) {
                                                                LazyKt__LazyJVMKt lazyKt__LazyJVMKt2 = getevaluserid.r8lambdaXj9c8VIP9DfEvaTmZt0ejAuC4a4[i15];
                                                                if ((lazyKt__LazyJVMKt2 instanceof ProtoErrorCodeCompanion) && ((ProtoErrorCodeCompanion) lazyKt__LazyJVMKt2).read.equals(clsWrite11)) {
                                                                    throw getKind.IconCompatParcelizer(method, i9, "@Tag type " + clsWrite11.getName() + " is duplicate of " + ProtoErrorMsgCompanion.write.IconCompatParcelizer(method, i15) + " and would always overwrite its value.", new Object[0]);
                                                                }
                                                            }
                                                            protoErrorCodeCompanion = new ProtoErrorCodeCompanion(clsWrite11);
                                                        } else {
                                                            protoCustomerProfileMsgCompanion = null;
                                                        }
                                                        protoCustomerProfileMsgCompanion = protoErrorCodeCompanion;
                                                    }
                                                }
                                                lazyKt__LazyJVMKtArr2 = lazyKt__LazyJVMKtArr3;
                                            }
                                        }
                                        protoCustomerProfileMsgCompanion = protoErrorCode;
                                        lazyKt__LazyJVMKtArr2 = lazyKt__LazyJVMKtArr3;
                                    }
                                    if (protoCustomerProfileMsgCompanion != null) {
                                        if (lazyKt__LazyJVMKt == null) {
                                            throw getKind.IconCompatParcelizer(method, i9, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                        }
                                        lazyKt__LazyJVMKt = protoCustomerProfileMsgCompanion;
                                    }
                                    i5++;
                                    annotationArr3 = annotationArr5;
                                    length2 = i11;
                                    i8 = i3;
                                    length3 = i4;
                                    str3 = str2;
                                    lazyKt__LazyJVMKtArr3 = lazyKt__LazyJVMKtArr2;
                                }
                                protoCustomerProfileMsgCompanion = protoCustomerProfileMsgserializer;
                                str2 = str3;
                                lazyKt__LazyJVMKtArr2 = lazyKt__LazyJVMKtArr3;
                                i4 = length3;
                                if (protoCustomerProfileMsgCompanion != null) {
                                    if (lazyKt__LazyJVMKt == null) {
                                        throw getKind.IconCompatParcelizer(method, i9, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                    }
                                    lazyKt__LazyJVMKt = protoCustomerProfileMsgCompanion;
                                }
                                i5++;
                                annotationArr3 = annotationArr5;
                                length2 = i11;
                                i8 = i3;
                                length3 = i4;
                                str3 = str2;
                                lazyKt__LazyJVMKtArr3 = lazyKt__LazyJVMKtArr2;
                            }
                            annotationArr = annotationArr3;
                            i = length2;
                            str = str3;
                            i2 = i8;
                            lazyKt__LazyJVMKtArr = lazyKt__LazyJVMKtArr3;
                        } else {
                            annotationArr = annotationArr3;
                            i = length2;
                            str = str3;
                            i2 = i8;
                            lazyKt__LazyJVMKtArr = lazyKt__LazyJVMKtArr3;
                            lazyKt__LazyJVMKt = null;
                        }
                        if (lazyKt__LazyJVMKt == null) {
                            if (i10 != 0) {
                                try {
                                    if (getKind.write(type) == ShortNewsContentCardView.class) {
                                        getevaluserid.r8lambda7IJBVrN0sHyidCAZufWEJFc7yY = true;
                                        lazyKt__LazyJVMKt = null;
                                    }
                                } catch (NoClassDefFoundError unused) {
                                }
                            }
                            throw getKind.IconCompatParcelizer(method, i9, "No Retrofit annotation found.", new Object[0]);
                        }
                        lazyKt__LazyJVMKtArr[i9] = lazyKt__LazyJVMKt;
                        i9++;
                        annotationArr3 = annotationArr;
                        length2 = i;
                        i8 = i2;
                        str3 = str;
                        i5 = 0;
                        i7 = 1;
                    }
                    String str5 = str3;
                    if (getevaluserid.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss == null && !getevaluserid.MediaSessionCompatResultReceiverWrapper) {
                        throw getKind.read(method, null, "Missing either @%s URL or @Url parameter.", getevaluserid.MediaSessionCompatToken);
                    }
                    boolean z5 = getevaluserid.PlaybackStateCompat;
                    if (!z5 && !getevaluserid.r8lambda54BeH8ZsBru0CXI2CCSP2syNys && !getevaluserid.PlaybackStateCompatCustomAction && getevaluserid.write) {
                        throw getKind.read(method, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                    }
                    if (z5 && !getevaluserid.RemoteActionCompatParcelizer) {
                        throw getKind.read(method, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                    }
                    if (getevaluserid.r8lambda54BeH8ZsBru0CXI2CCSP2syNys && !getevaluserid.MediaDescriptionCompat) {
                        throw getKind.read(method, null, "Multipart method must contain at least one @Part.", new Object[0]);
                    }
                    final accessgetHoldouts accessgetholdouts = new accessgetHoldouts(getevaluserid);
                    Type genericReturnType2 = method.getGenericReturnType();
                    if (!getKind.read(genericReturnType2)) {
                        if (genericReturnType2 != Void.TYPE) {
                            Annotation[] annotations = method.getAnnotations();
                            boolean z6 = accessgetholdouts.MediaMetadataCompat;
                            if (z6) {
                                Type[] genericParameterTypes = method.getGenericParameterTypes();
                                Type type8 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                                if (type8 instanceof WildcardType) {
                                    type8 = ((WildcardType) type8).getLowerBounds()[0];
                                }
                                if (getKind.write(type8) == getHoldoutVariationName.class && (type8 instanceof ParameterizedType)) {
                                    type8 = getKind.read(0, (ParameterizedType) type8);
                                    z = true;
                                    z2 = false;
                                } else if (getKind.write(type8) != syncCustomerProfile.class) {
                                    z2 = getKind.RemoteActionCompatParcelizer && type8 == createFromParcel.class;
                                    z = false;
                                } else {
                                    throw getKind.read(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", getKind.read(0, (ParameterizedType) type8));
                                }
                                genericReturnType = new getTargets(null, syncCustomerProfile.class, type8);
                                if (!getKind.read(annotations, getRules.class)) {
                                    Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                                    annotationArr6[0] = getOffVariation.write;
                                    System.arraycopy(annotations, 0, annotationArr6, 1, annotations.length);
                                    annotations = annotationArr6;
                                }
                            } else {
                                genericReturnType = method.getGenericReturnType();
                                z = false;
                                z2 = false;
                            }
                            try {
                                final useEvaluationsCache useevaluationscacheIconCompatParcelizer = getholdoutvariation.IconCompatParcelizer(genericReturnType, annotations);
                                Type typeRemoteActionCompatParcelizer = useevaluationscacheIconCompatParcelizer.RemoteActionCompatParcelizer();
                                if (typeRemoteActionCompatParcelizer != _get_messageWebView_lambda1.class) {
                                    if (typeRemoteActionCompatParcelizer != getHoldoutVariationName.class) {
                                        if (accessgetholdouts.serializer.equals(str5) && !Void.class.equals(typeRemoteActionCompatParcelizer) && (!getKind.RemoteActionCompatParcelizer || typeRemoteActionCompatParcelizer != createFromParcel.class)) {
                                            throw getKind.read(method, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                                        }
                                        try {
                                            final FwFClientKt fwFClientKtRemoteActionCompatParcelizer = getholdoutvariation.RemoteActionCompatParcelizer(typeRemoteActionCompatParcelizer, method.getAnnotations());
                                            final getMessageImageView getmessageimageview = getholdoutvariation.RemoteActionCompatParcelizer;
                                            if (!z6) {
                                                return new TimerKt(accessgetholdouts, getmessageimageview, fwFClientKtRemoteActionCompatParcelizer, useevaluationscacheIconCompatParcelizer);
                                            }
                                            if (z) {
                                                return new startCoroutineTimer(accessgetholdouts, getmessageimageview, fwFClientKtRemoteActionCompatParcelizer, useevaluationscacheIconCompatParcelizer) { // from class: retrofit2.HttpServiceMethod$SuspendForResponse
                                                    public final useEvaluationsCache read;

                                                    @Override // o.startCoroutineTimer
                                                    public final Object adapt(writeSelffwf_client_release writeselffwf_client_release, Object[] objArr) {
                                                        syncCustomerProfile synccustomerprofile = (syncCustomerProfile) this.read.write(writeselffwf_client_release);
                                                        ShortNewsContentCardView shortNewsContentCardView = (ShortNewsContentCardView) objArr[objArr.length - 1];
                                                        try {
                                                            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, LoadBalancer$Helper.intercepted(shortNewsContentCardView));
                                                            cancellableContinuationImpl.read();
                                                            cancellableContinuationImpl.IconCompatParcelizer((r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM) new ProtoClauseMsg(synccustomerprofile, 2));
                                                            synccustomerprofile.IconCompatParcelizer(new accessgetchildSerializerscp(cancellableContinuationImpl, 2));
                                                            Object result = cancellableContinuationImpl.getResult();
                                                            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                                            return result;
                                                        } catch (Exception e3) {
                                                            return UrlUtils.suspendAndThrow(e3, shortNewsContentCardView);
                                                        }
                                                    }

                                                    {
                                                        this.read = useevaluationscacheIconCompatParcelizer;
                                                    }
                                                };
                                            }
                                            return new TimerstartCoroutineTimer1(accessgetholdouts, getmessageimageview, fwFClientKtRemoteActionCompatParcelizer, useevaluationscacheIconCompatParcelizer, z2);
                                        } catch (RuntimeException e3) {
                                            throw getKind.read(method, e3, "Unable to create converter for %s", typeRemoteActionCompatParcelizer);
                                        }
                                    }
                                    throw getKind.read(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                                }
                                throw getKind.read(method, null, "'" + getKind.write(typeRemoteActionCompatParcelizer).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                            } catch (RuntimeException e4) {
                                throw getKind.read(method, e4, "Unable to create call adapter for %s", genericReturnType);
                            }
                        }
                        throw getKind.read(method, null, "Service methods cannot return void.", new Object[0]);
                    }
                    throw getKind.read(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                throw getKind.read(method, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
            }
        }
    }
}
