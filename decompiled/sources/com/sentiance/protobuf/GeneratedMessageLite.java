package com.sentiance.protobuf;

import bo.app.c8$$ExternalSyntheticOutline0;
import com.deliveryhero.performance.core.screenmetric.ScreenStartObserver$$ExternalSyntheticLambda0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import o.BrazeUserChangeEvent;
import o.BrazeViewBounds;
import o.CardKey;
import o.CardKeyCompanion;
import o.ContentCardsUpdatedEventCompanion;
import o.DataStoreValueType;
import o.DelayedInitializationAnalyticsBehavior;
import o.DrawableTransformation;
import o.FeatureFlagsUpdatedEvent;
import o.IEventSubscriber;
import o.IFireOnceEventSubscriber;
import o.IValueCallback;
import o.ImageStyle;
import o.SimpleValueCallback;
import o.accessgetCardTypeMapcp;
import o.accessgetDiskCacheLockp;
import o.accessgetDiskLruCachep;
import o.accessgetTAGcp;
import o.accessisOfflinep;
import o.accesssetDiskLruCachep;
import o.fromStringlambda1;
import o.getCardTypeFromJson;
import o.getFeatureFlags;
import o.getFlagCount;
import o.getRequestInitiationTime;
import o.getServerKeyFromCardType;
import o.getTimestampSeconds;
import o.getUnviewedCardCount;
import o.getWidthDp;
import o.isTimestampOlderThan;
import o.onSuccess;
import o.r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY;
import o.r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0;
import o.r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4;
import o.r8lambdaxY_zA9fYSiZ3BNvgPAiDNJd_aig;
import o.r8lambdayUqGVEpC1kg8ua3jc9a113shNIE;
import o.setRuntimeAppConfigurationProvider;
import o.toJsonArray;
import o.writeStringlambda1;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GeneratedMessageLite extends a {
    private static Map<Object, GeneratedMessageLite> IconCompatParcelizer = new ConcurrentHashMap();
    private int read;
    public IValueCallback serializer;

    public abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite implements accessgetDiskLruCachep {
        public ImageStyle extensions = ImageStyle.read;

        @Override // com.sentiance.protobuf.GeneratedMessageLite, o.accessgetDiskLruCachep
        public /* bridge */ /* synthetic */ accessgetDiskCacheLockp getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // com.sentiance.protobuf.GeneratedMessageLite, o.accessgetDiskCacheLockp
        public /* bridge */ /* synthetic */ r8lambdaxY_zA9fYSiZ3BNvgPAiDNJd_aig newBuilderForType() {
            return newBuilderForType();
        }

        @Override // com.sentiance.protobuf.GeneratedMessageLite, o.accessgetDiskCacheLockp
        public /* bridge */ /* synthetic */ r8lambdaxY_zA9fYSiZ3BNvgPAiDNJd_aig toBuilder() {
            return toBuilder();
        }

        private void mergeMessageSetExtensionFromBytes(ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior, getServerKeyFromCardType getserverkeyfromcardtype) throws IOException {
            accessgetDiskCacheLockp accessgetdiskcachelockp = (accessgetDiskCacheLockp) this.extensions.serializer.get(getserverkeyfromcardtype.IconCompatParcelizer);
            r8lambdaxY_zA9fYSiZ3BNvgPAiDNJd_aig builder = accessgetdiskcachelockp != null ? accessgetdiskcachelockp.toBuilder() : null;
            if (builder == null) {
                builder = getserverkeyfromcardtype.serializer.newBuilderForType();
            }
            CardKey cardKey = (CardKey) builder;
            cardKey.getClass();
            try {
                u uVarRemoteActionCompatParcelizer = byteString.RemoteActionCompatParcelizer();
                cardKey.write(uVarRemoteActionCompatParcelizer, delayedInitializationAnalyticsBehavior);
                uVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(0);
                ensureExtensionsAreMutable().RemoteActionCompatParcelizer(getserverkeyfromcardtype.IconCompatParcelizer, getserverkeyfromcardtype.write(cardKey.write()));
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading " + cardKey.getClass().getName() + " from a ByteString threw an IOException (should never happen).", e2);
            }
        }

        private void verifyExtensionContainingType(getServerKeyFromCardType getserverkeyfromcardtype) {
            if (getserverkeyfromcardtype.write == getDefaultInstanceForType()) {
                return;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public ImageStyle ensureExtensionsAreMutable() {
            ImageStyle imageStyle = this.extensions;
            if (imageStyle.RemoteActionCompatParcelizer) {
                this.extensions = imageStyle.clone();
            }
            return this.extensions;
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.serializer();
        }

        public int extensionsSerializedSize() {
            return this.extensions.IconCompatParcelizer();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.write();
        }

        public final void mergeExtensionFields(MessageType messagetype) {
            ImageStyle imageStyle = this.extensions;
            if (imageStyle.RemoteActionCompatParcelizer) {
                this.extensions = imageStyle.clone();
            }
            this.extensions.read(messagetype.extensions);
        }

        public getWidthDp newExtensionWriter() {
            return new getWidthDp(this);
        }

        public getWidthDp newMessageSetExtensionWriter() {
            return new getWidthDp(this);
        }

        public <MessageType extends accessgetDiskCacheLockp> boolean parseUnknownField(MessageType messagetype, u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior, int i) throws IOException {
            int i2 = i >>> 3;
            return parseExtension(uVar, delayedInitializationAnalyticsBehavior, delayedInitializationAnalyticsBehavior.serializer(i2, messagetype), i, i2);
        }

        private <MessageType extends accessgetDiskCacheLockp> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws IOException {
            int iSerializer = 0;
            ByteString byteStringMediaSessionCompatToken = null;
            getServerKeyFromCardType getserverkeyfromcardtypeSerializer = null;
            while (true) {
                int i = uVar.read();
                if (i == 0) {
                    break;
                }
                if (i == 16) {
                    iSerializer = uVar.serializer();
                    if (iSerializer != 0) {
                        getserverkeyfromcardtypeSerializer = delayedInitializationAnalyticsBehavior.serializer(iSerializer, messagetype);
                    }
                } else if (i == 26) {
                    if (iSerializer != 0 && getserverkeyfromcardtypeSerializer != null) {
                        eagerlyMergeMessageSetExtension(uVar, getserverkeyfromcardtypeSerializer, delayedInitializationAnalyticsBehavior, iSerializer);
                        byteStringMediaSessionCompatToken = null;
                    } else {
                        byteStringMediaSessionCompatToken = uVar.MediaSessionCompatToken();
                    }
                } else if (!uVar.read(i)) {
                    break;
                }
            }
            uVar.RemoteActionCompatParcelizer(12);
            if (byteStringMediaSessionCompatToken == null || iSerializer == 0) {
                return;
            }
            if (getserverkeyfromcardtypeSerializer != null) {
                mergeMessageSetExtensionFromBytes(byteStringMediaSessionCompatToken, delayedInitializationAnalyticsBehavior, getserverkeyfromcardtypeSerializer);
            } else {
                mergeLengthDelimitedField(iSerializer, byteStringMediaSessionCompatToken);
            }
        }

        /* JADX WARN: Type inference failed for: r1v4, types: [Type, java.util.ArrayList] */
        public final <Type> Type getExtension(CardKeyCompanion cardKeyCompanion) {
            getServerKeyFromCardType getserverkeyfromcardtypeAccess$000 = GeneratedMessageLite.access$000(cardKeyCompanion);
            verifyExtensionContainingType(getserverkeyfromcardtypeAccess$000);
            ImageStyle imageStyle = this.extensions;
            Type type = (Type) imageStyle.serializer.get(getserverkeyfromcardtypeAccess$000.IconCompatParcelizer);
            if (type == null) {
                return (Type) getserverkeyfromcardtypeAccess$000.RemoteActionCompatParcelizer;
            }
            accessgetCardTypeMapcp accessgetcardtypemapcp = getserverkeyfromcardtypeAccess$000.IconCompatParcelizer;
            if (!accessgetcardtypemapcp.IconCompatParcelizer) {
                return (Type) getserverkeyfromcardtypeAccess$000.serializer(type);
            }
            if (accessgetcardtypemapcp.read.getJavaType() != WireFormat$JavaType.ENUM) {
                return type;
            }
            ?? r1 = (Type) new ArrayList();
            Iterator it = ((List) type).iterator();
            while (it.hasNext()) {
                r1.add(getserverkeyfromcardtypeAccess$000.serializer(it.next()));
            }
            return r1;
        }

        public final <Type> int getExtensionCount(CardKeyCompanion cardKeyCompanion) {
            getServerKeyFromCardType getserverkeyfromcardtypeAccess$000 = GeneratedMessageLite.access$000(cardKeyCompanion);
            verifyExtensionContainingType(getserverkeyfromcardtypeAccess$000);
            ImageStyle imageStyle = this.extensions;
            accessgetCardTypeMapcp accessgetcardtypemapcp = getserverkeyfromcardtypeAccess$000.IconCompatParcelizer;
            imageStyle.getClass();
            if (!accessgetcardtypemapcp.IconCompatParcelizer) {
                ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("getRepeatedField() can only be called on repeated fields.");
                return 0;
            }
            Object obj = imageStyle.serializer.get(accessgetcardtypemapcp);
            if (obj == null) {
                return 0;
            }
            return ((List) obj).size();
        }

        public final <Type> boolean hasExtension(CardKeyCompanion cardKeyCompanion) {
            getServerKeyFromCardType getserverkeyfromcardtypeAccess$000 = GeneratedMessageLite.access$000(cardKeyCompanion);
            verifyExtensionContainingType(getserverkeyfromcardtypeAccess$000);
            ImageStyle imageStyle = this.extensions;
            accessgetCardTypeMapcp accessgetcardtypemapcp = getserverkeyfromcardtypeAccess$000.IconCompatParcelizer;
            imageStyle.getClass();
            if (!accessgetcardtypemapcp.IconCompatParcelizer) {
                return imageStyle.serializer.get(accessgetcardtypemapcp) != null;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("hasField() can only be called on non-repeated fields.");
            return false;
        }

        public <MessageType extends accessgetDiskCacheLockp> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior, int i) throws IOException {
            if (i == 11) {
                mergeMessageSetExtensionFromCodedStream(messagetype, uVar, delayedInitializationAnalyticsBehavior);
                return true;
            }
            if ((i & 7) == 2) {
                return parseUnknownField(messagetype, uVar, delayedInitializationAnalyticsBehavior, i);
            }
            return uVar.read(i);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x0026  */
        private boolean parseExtension(u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior, getServerKeyFromCardType getserverkeyfromcardtype, int i, int i2) throws IOException {
            boolean z;
            Object objWrite;
            accessgetDiskCacheLockp accessgetdiskcachelockp;
            int i3 = i & 7;
            boolean z2 = false;
            if (getserverkeyfromcardtype == null) {
                z = false;
                z2 = true;
            } else {
                accessgetCardTypeMapcp accessgetcardtypemapcp = getserverkeyfromcardtype.IconCompatParcelizer;
                WireFormat$FieldType wireFormat$FieldType = accessgetcardtypemapcp.read;
                ImageStyle imageStyle = ImageStyle.read;
                if (i3 == wireFormat$FieldType.getWireType()) {
                    z = false;
                } else if (accessgetcardtypemapcp.IconCompatParcelizer && accessgetcardtypemapcp.read.isPackable() && i3 == 2) {
                    z = true;
                } else {
                    z = false;
                    z2 = true;
                }
            }
            if (z2) {
                return parseUnknownField(i, uVar);
            }
            ensureExtensionsAreMutable();
            if (z) {
                int iIconCompatParcelizer = uVar.IconCompatParcelizer(uVar.r8lambdaG6Thfp3wAqF9QgDIJrKyBT1uzss());
                accessgetCardTypeMapcp accessgetcardtypemapcp2 = getserverkeyfromcardtype.IconCompatParcelizer;
                if (accessgetcardtypemapcp2.read == WireFormat$FieldType.ENUM) {
                    while (uVar.MediaSessionCompatQueueItem() > 0) {
                        IEventSubscriber iEventSubscriber = accessgetcardtypemapcp2.write.read(uVar.PlaybackStateCompatCustomAction());
                        if (iEventSubscriber == null) {
                            return true;
                        }
                        this.extensions.read(accessgetcardtypemapcp2, getserverkeyfromcardtype.write(iEventSubscriber));
                    }
                } else {
                    while (uVar.MediaSessionCompatQueueItem() > 0) {
                        WireFormat$FieldType wireFormat$FieldType2 = accessgetcardtypemapcp2.read;
                        ImageStyle imageStyle2 = ImageStyle.read;
                        this.extensions.read(accessgetcardtypemapcp2, BrazeUserChangeEvent.write(uVar, wireFormat$FieldType2, WireFormat$Utf8Validation.LOOSE));
                    }
                }
                uVar.write(iIconCompatParcelizer);
                return true;
            }
            int[] iArr = toJsonArray.RemoteActionCompatParcelizer;
            accessgetCardTypeMapcp accessgetcardtypemapcp3 = getserverkeyfromcardtype.IconCompatParcelizer;
            int i4 = iArr[accessgetcardtypemapcp3.read.getJavaType().ordinal()];
            if (i4 == 1) {
                r8lambdaxY_zA9fYSiZ3BNvgPAiDNJd_aig builder = (accessgetcardtypemapcp3.IconCompatParcelizer || (accessgetdiskcachelockp = (accessgetDiskCacheLockp) this.extensions.serializer.get(accessgetcardtypemapcp3)) == null) ? null : accessgetdiskcachelockp.toBuilder();
                if (builder == null) {
                    builder = getserverkeyfromcardtype.serializer.newBuilderForType();
                }
                if (accessgetcardtypemapcp3.read == WireFormat$FieldType.GROUP) {
                    uVar.RemoteActionCompatParcelizer(accessgetcardtypemapcp3.RemoteActionCompatParcelizer, builder, delayedInitializationAnalyticsBehavior);
                } else {
                    uVar.read(builder, delayedInitializationAnalyticsBehavior);
                }
                objWrite = ((CardKey) builder).write();
            } else if (i4 != 2) {
                WireFormat$FieldType wireFormat$FieldType3 = accessgetcardtypemapcp3.read;
                ImageStyle imageStyle3 = ImageStyle.read;
                objWrite = BrazeUserChangeEvent.write(uVar, wireFormat$FieldType3, WireFormat$Utf8Validation.LOOSE);
            } else {
                int iPlaybackStateCompatCustomAction = uVar.PlaybackStateCompatCustomAction();
                IEventSubscriber iEventSubscriber2 = accessgetcardtypemapcp3.write.read(iPlaybackStateCompatCustomAction);
                if (iEventSubscriber2 == null) {
                    mergeVarintField(i2, iPlaybackStateCompatCustomAction);
                    return true;
                }
                objWrite = iEventSubscriber2;
            }
            boolean z3 = accessgetcardtypemapcp3.IconCompatParcelizer;
            ImageStyle imageStyle4 = this.extensions;
            if (z3) {
                imageStyle4.read(accessgetcardtypemapcp3, getserverkeyfromcardtype.write(objWrite));
                return true;
            }
            imageStyle4.RemoteActionCompatParcelizer(accessgetcardtypemapcp3, getserverkeyfromcardtype.write(objWrite));
            return true;
        }

        private void eagerlyMergeMessageSetExtension(u uVar, getServerKeyFromCardType getserverkeyfromcardtype, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior, int i) throws IOException {
            parseExtension(uVar, delayedInitializationAnalyticsBehavior, getserverkeyfromcardtype, (i << 3) | 2, i);
        }

        public final <Type> Type getExtension(CardKeyCompanion cardKeyCompanion, int i) {
            getServerKeyFromCardType getserverkeyfromcardtypeAccess$000 = GeneratedMessageLite.access$000(cardKeyCompanion);
            verifyExtensionContainingType(getserverkeyfromcardtypeAccess$000);
            ImageStyle imageStyle = this.extensions;
            accessgetCardTypeMapcp accessgetcardtypemapcp = getserverkeyfromcardtypeAccess$000.IconCompatParcelizer;
            imageStyle.getClass();
            if (accessgetcardtypemapcp.IconCompatParcelizer) {
                Object obj = imageStyle.serializer.get(accessgetcardtypemapcp);
                if (obj != null) {
                    return (Type) getserverkeyfromcardtypeAccess$000.serializer(((List) obj).get(i));
                }
                throw new IndexOutOfBoundsException();
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("getRepeatedField() can only be called on repeated fields.");
            return null;
        }
    }

    public enum MethodToInvoke {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static ContentCardsUpdatedEventCompanion emptyBooleanList() {
        return r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4.RemoteActionCompatParcelizer;
    }

    public static isTimestampOlderThan emptyDoubleList() {
        return accesssetDiskLruCachep.serializer;
    }

    public static getFlagCount emptyFloatList() {
        return getRequestInitiationTime.write;
    }

    public static FeatureFlagsUpdatedEvent emptyIntList() {
        return getUnviewedCardCount.serializer;
    }

    public static IFireOnceEventSubscriber emptyLongList() {
        return r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0.RemoteActionCompatParcelizer;
    }

    public static <E> onSuccess emptyProtobufList() {
        return getCardTypeFromJson.write;
    }

    public static Object invokeOrDie(java.lang.reflect.Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.serializer("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public void clearMemoizedHashCode() {
        this.write = 0;
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj) {
        return dynamicMethod(methodToInvoke, obj, null);
    }

    public abstract Object dynamicMethod(MethodToInvoke methodToInvoke, Object obj, Object obj2);

    public int getMemoizedHashCode() {
        return this.write;
    }

    public int getMemoizedSerializedSize() {
        return this.read & Integer.MAX_VALUE;
    }

    public boolean hashCodeIsNotMemoized() {
        return getMemoizedHashCode() == 0;
    }

    public boolean isMutable() {
        return (this.read & Integer.MIN_VALUE) != 0;
    }

    public void setMemoizedHashCode(int i) {
        this.write = i;
    }

    public static <T extends GeneratedMessageLite> T getDefaultInstance(Class<T> cls) {
        T t = (T) IconCompatParcelizer.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) IconCompatParcelizer.get(cls);
            } catch (ClassNotFoundException e) {
                ScreenStartObserver$$ExternalSyntheticLambda0.write("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((GeneratedMessageLite) SimpleValueCallback.IconCompatParcelizer(cls)).getDefaultInstanceForType();
        if (t2 != null) {
            IconCompatParcelizer.put(cls, t2);
            return t2;
        }
        r8lambdayUqGVEpC1kg8ua3jc9a113shNIE.RemoteActionCompatParcelizer();
        return null;
    }

    public static final <T extends GeneratedMessageLite> boolean isInitialized(T t, boolean z) {
        byte bByteValue = ((Byte) t.dynamicMethod(MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        BrazeViewBounds brazeViewBounds = BrazeViewBounds.read;
        brazeViewBounds.getClass();
        boolean zSerializer = brazeViewBounds.read(t.getClass()).serializer(t);
        if (z) {
            t.dynamicMethod(MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED, zSerializer ? t : null);
        }
        return zSerializer;
    }

    public static Object newMessageInfo(accessgetDiskCacheLockp accessgetdiskcachelockp, String str, Object[] objArr) {
        return new DataStoreValueType(accessgetdiskcachelockp, str, objArr);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(MethodToInvoke.BUILD_MESSAGE_INFO);
    }

    public int computeHashCode() {
        BrazeViewBounds brazeViewBounds = BrazeViewBounds.read;
        brazeViewBounds.getClass();
        return brazeViewBounds.read(getClass()).IconCompatParcelizer(this);
    }

    public final <MessageType extends GeneratedMessageLite, BuilderType extends CardKey> BuilderType createBuilder() {
        return (BuilderType) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    @Override // o.accessgetDiskLruCachep
    public final GeneratedMessageLite getDefaultInstanceForType() {
        return (GeneratedMessageLite) dynamicMethod(MethodToInvoke.GET_DEFAULT_INSTANCE);
    }

    public final writeStringlambda1 getParserForType() {
        return (writeStringlambda1) dynamicMethod(MethodToInvoke.GET_PARSER);
    }

    public void makeImmutable() {
        BrazeViewBounds brazeViewBounds = BrazeViewBounds.read;
        brazeViewBounds.getClass();
        brazeViewBounds.read(getClass()).IconCompatParcelizer((Object) this);
        markImmutable();
    }

    public void mergeLengthDelimitedField(int i, ByteString byteString) {
        if (this.serializer == IValueCallback.write) {
            this.serializer = new IValueCallback();
        }
        IValueCallback iValueCallback = this.serializer;
        iValueCallback.serializer();
        if (i != 0) {
            iValueCallback.write((i << 3) | 2, byteString);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Zero is not a valid field number.");
        }
    }

    public final void mergeUnknownFields(IValueCallback iValueCallback) {
        this.serializer = IValueCallback.IconCompatParcelizer(this.serializer, iValueCallback);
    }

    public void mergeVarintField(int i, int i2) {
        if (this.serializer == IValueCallback.write) {
            this.serializer = new IValueCallback();
        }
        IValueCallback iValueCallback = this.serializer;
        iValueCallback.serializer();
        if (i != 0) {
            iValueCallback.write(i << 3, Long.valueOf(i2));
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.IconCompatParcelizer("Zero is not a valid field number.");
        }
    }

    @Override // o.accessgetDiskCacheLockp
    public final CardKey newBuilderForType() {
        return (CardKey) dynamicMethod(MethodToInvoke.NEW_BUILDER);
    }

    public GeneratedMessageLite newMutableInstance() {
        return (GeneratedMessageLite) dynamicMethod(MethodToInvoke.NEW_MUTABLE_INSTANCE);
    }

    public void setMemoizedSerializedSize(int i) {
        if (i >= 0) {
            this.read = (i & Integer.MAX_VALUE) | (this.read & Integer.MIN_VALUE);
        } else {
            ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m(i, "serialized size must be non-negative, was "));
        }
    }

    @Override // o.accessgetDiskCacheLockp
    public final CardKey toBuilder() {
        CardKey cardKey = (CardKey) dynamicMethod(MethodToInvoke.NEW_BUILDER);
        cardKey.serializer(this);
        return cardKey;
    }

    @Override // o.accessgetDiskCacheLockp
    public void writeTo(setRuntimeAppConfigurationProvider setruntimeappconfigurationprovider) throws IOException {
        BrazeViewBounds brazeViewBounds = BrazeViewBounds.read;
        brazeViewBounds.getClass();
        fromStringlambda1 fromstringlambda1 = brazeViewBounds.read(getClass());
        accessisOfflinep accessisofflinep = setruntimeappconfigurationprovider.IconCompatParcelizer;
        if (accessisofflinep == null) {
            accessisofflinep = new accessisOfflinep(setruntimeappconfigurationprovider);
        }
        fromstringlambda1.read(this, accessisofflinep);
    }

    public static getServerKeyFromCardType access$000(CardKeyCompanion cardKeyCompanion) {
        cardKeyCompanion.getClass();
        return (getServerKeyFromCardType) cardKeyCompanion;
    }

    public static <T extends GeneratedMessageLite> void registerDefaultInstance(Class<T> cls, T t) {
        t.markImmutable();
        IconCompatParcelizer.put(cls, t);
    }

    public void clearMemoizedSerializedSize() {
        setMemoizedSerializedSize(Integer.MAX_VALUE);
    }

    public GeneratedMessageLite() {
        this.write = 0;
        this.read = -1;
        this.serializer = IValueCallback.write;
    }

    public static GeneratedMessageLite a(GeneratedMessageLite generatedMessageLite, byte[] bArr, int i, int i2, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        GeneratedMessageLite generatedMessageLiteNewMutableInstance = generatedMessageLite.newMutableInstance();
        try {
            BrazeViewBounds brazeViewBounds = BrazeViewBounds.read;
            brazeViewBounds.getClass();
            fromStringlambda1 fromstringlambda1 = brazeViewBounds.read(generatedMessageLiteNewMutableInstance.getClass());
            r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY r8lambdacyuxafptvn7drfel1dgtevxcy = new r8lambdaCYUxafPtvN7DRfEl1DgTEVxcY();
            delayedInitializationAnalyticsBehavior.getClass();
            r8lambdacyuxafptvn7drfel1dgtevxcy.IconCompatParcelizer = delayedInitializationAnalyticsBehavior;
            fromstringlambda1.RemoteActionCompatParcelizer(generatedMessageLiteNewMutableInstance, bArr, i, i + i2, r8lambdacyuxafptvn7drfel1dgtevxcy);
            fromstringlambda1.IconCompatParcelizer((Object) generatedMessageLiteNewMutableInstance);
            return generatedMessageLiteNewMutableInstance;
        } catch (InvalidProtocolBufferException e) {
            e = e;
            if (e.MediaMetadataCompat()) {
                e = new InvalidProtocolBufferException(e);
            }
            e.write(generatedMessageLiteNewMutableInstance);
            throw e;
        } catch (UninitializedMessageException e2) {
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
            invalidProtocolBufferException.write(generatedMessageLiteNewMutableInstance);
            throw invalidProtocolBufferException;
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            InvalidProtocolBufferException invalidProtocolBufferException2 = new InvalidProtocolBufferException(e3);
            invalidProtocolBufferException2.write(generatedMessageLiteNewMutableInstance);
            throw invalidProtocolBufferException2;
        } catch (IndexOutOfBoundsException unused) {
            InvalidProtocolBufferException invalidProtocolBufferExceptionMediaBrowserCompatMediaItem = InvalidProtocolBufferException.MediaBrowserCompatMediaItem();
            invalidProtocolBufferExceptionMediaBrowserCompatMediaItem.write(generatedMessageLiteNewMutableInstance);
            throw invalidProtocolBufferExceptionMediaBrowserCompatMediaItem;
        }
    }

    public static <T extends GeneratedMessageLite> T parseDelimitedFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        T t2 = (T) a(t, inputStream, DelayedInitializationAnalyticsBehavior.write());
        a(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite> T parsePartialFrom(T t, u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        T t2 = (T) t.newMutableInstance();
        try {
            BrazeViewBounds brazeViewBounds = BrazeViewBounds.read;
            brazeViewBounds.getClass();
            fromStringlambda1 fromstringlambda1 = brazeViewBounds.read(t2.getClass());
            v vVar = uVar.RemoteActionCompatParcelizer;
            if (vVar == null) {
                vVar = new v(uVar);
            }
            fromstringlambda1.write(t2, vVar, delayedInitializationAnalyticsBehavior);
            fromstringlambda1.IconCompatParcelizer((Object) t2);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            e = e;
            if (e.MediaMetadataCompat()) {
                e = new InvalidProtocolBufferException(e);
            }
            e.write(t2);
            throw e;
        } catch (UninitializedMessageException e2) {
            InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(e2.getMessage());
            invalidProtocolBufferException.write(t2);
            throw invalidProtocolBufferException;
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            InvalidProtocolBufferException invalidProtocolBufferException2 = new InvalidProtocolBufferException(e3);
            invalidProtocolBufferException2.write(t2);
            throw invalidProtocolBufferException2;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e4.getCause());
            }
            throw e4;
        }
    }

    public String toString() {
        String string = super.toString();
        char[] cArr = accessgetTAGcp.write;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        accessgetTAGcp.IconCompatParcelizer(this, sb, 0);
        return sb.toString();
    }

    public Object dynamicMethod(MethodToInvoke methodToInvoke) {
        return dynamicMethod(methodToInvoke, null, null);
    }

    public int hashCode() {
        if (isMutable()) {
            return computeHashCode();
        }
        if (hashCodeIsNotMemoized()) {
            setMemoizedHashCode(computeHashCode());
        }
        return getMemoizedHashCode();
    }

    public void markImmutable() {
        this.read &= Integer.MAX_VALUE;
    }

    public static java.lang.reflect.Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            ScreenStartObserver$$ExternalSyntheticLambda0.RemoteActionCompatParcelizer("Generated message class \"", cls.getName(), "\" missing method \"", str, "\".", e);
            return null;
        }
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, ByteBuffer byteBuffer, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        u uVarIconCompatParcelizer;
        if (byteBuffer.hasArray()) {
            byte[] bArrArray = byteBuffer.array();
            int iArrayOffset = byteBuffer.arrayOffset();
            uVarIconCompatParcelizer = u.IconCompatParcelizer(bArrArray, byteBuffer.position() + iArrayOffset, byteBuffer.remaining(), false);
        } else if (byteBuffer.isDirect() && SimpleValueCallback.read) {
            uVarIconCompatParcelizer = new u.e(byteBuffer, false);
        } else {
            int iRemaining = byteBuffer.remaining();
            byte[] bArr = new byte[iRemaining];
            byteBuffer.duplicate().get(bArr);
            uVarIconCompatParcelizer = u.IconCompatParcelizer(bArr, 0, iRemaining, true);
        }
        T t2 = (T) parseFrom(t, uVarIconCompatParcelizer, delayedInitializationAnalyticsBehavior);
        a(t2);
        return t2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BrazeViewBounds brazeViewBounds = BrazeViewBounds.read;
        brazeViewBounds.getClass();
        return brazeViewBounds.read(getClass()).read(this, (GeneratedMessageLite) obj);
    }

    public boolean parseUnknownField(int i, u uVar) throws IOException {
        if ((i & 7) == 4) {
            return false;
        }
        if (this.serializer == IValueCallback.write) {
            this.serializer = new IValueCallback();
        }
        return this.serializer.RemoteActionCompatParcelizer(i, uVar);
    }

    @Override // com.sentiance.protobuf.a
    public int getSerializedSize(fromStringlambda1 fromstringlambda1) {
        int i;
        int i2;
        if (isMutable()) {
            if (fromstringlambda1 == null) {
                BrazeViewBounds brazeViewBounds = BrazeViewBounds.read;
                brazeViewBounds.getClass();
                i2 = brazeViewBounds.read(getClass()).read(this);
            } else {
                i2 = fromstringlambda1.read(this);
            }
            if (i2 >= 0) {
                return i2;
            }
            ScreenStartObserver$$ExternalSyntheticLambda0.write(c8$$ExternalSyntheticOutline0.m(i2, "serialized size must be non-negative, was "));
            return 0;
        }
        if (getMemoizedSerializedSize() != Integer.MAX_VALUE) {
            return getMemoizedSerializedSize();
        }
        if (fromstringlambda1 == null) {
            BrazeViewBounds brazeViewBounds2 = BrazeViewBounds.read;
            brazeViewBounds2.getClass();
            i = brazeViewBounds2.read(getClass()).read(this);
        } else {
            i = fromstringlambda1.read(this);
        }
        setMemoizedSerializedSize(i);
        return i;
    }

    public static <ContainingType extends accessgetDiskCacheLockp, Type> getServerKeyFromCardType newSingularGeneratedExtension(ContainingType containingtype, Type type, accessgetDiskCacheLockp accessgetdiskcachelockp, getFeatureFlags getfeatureflags, int i, WireFormat$FieldType wireFormat$FieldType, Class cls) {
        return new getServerKeyFromCardType(containingtype, type, accessgetdiskcachelockp, new accessgetCardTypeMapcp(getfeatureflags, i, wireFormat$FieldType, false, false));
    }

    public final <MessageType extends GeneratedMessageLite, BuilderType extends CardKey> BuilderType createBuilder(MessageType messagetype) {
        BuilderType buildertype = (BuilderType) createBuilder();
        buildertype.serializer(messagetype);
        return buildertype;
    }

    public static FeatureFlagsUpdatedEvent mutableCopy(FeatureFlagsUpdatedEvent featureFlagsUpdatedEvent) {
        int size = featureFlagsUpdatedEvent.size();
        int i = size == 0 ? 10 : size * 2;
        getUnviewedCardCount getunviewedcardcount = (getUnviewedCardCount) featureFlagsUpdatedEvent;
        if (i >= getunviewedcardcount.RemoteActionCompatParcelizer) {
            return new getUnviewedCardCount(Arrays.copyOf(getunviewedcardcount.IconCompatParcelizer, i), getunviewedcardcount.RemoteActionCompatParcelizer, true);
        }
        DrawableTransformation.write();
        return null;
    }

    public static <ContainingType extends accessgetDiskCacheLockp, Type> getServerKeyFromCardType newRepeatedGeneratedExtension(ContainingType containingtype, accessgetDiskCacheLockp accessgetdiskcachelockp, getFeatureFlags getfeatureflags, int i, WireFormat$FieldType wireFormat$FieldType, boolean z, Class cls) {
        return new getServerKeyFromCardType(containingtype, Collections.EMPTY_LIST, accessgetdiskcachelockp, new accessgetCardTypeMapcp(getfeatureflags, i, wireFormat$FieldType, true, z));
    }

    public static <T extends GeneratedMessageLite> T parseDelimitedFrom(T t, InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        T t2 = (T) a(t, inputStream, delayedInitializationAnalyticsBehavior);
        a(t2);
        return t2;
    }

    public static IFireOnceEventSubscriber mutableCopy(IFireOnceEventSubscriber iFireOnceEventSubscriber) {
        int size = iFireOnceEventSubscriber.size();
        int i = size == 0 ? 10 : size * 2;
        r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0 r8lambdawenh2zfjpauxgrrcztm8m6cjb0 = (r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0) iFireOnceEventSubscriber;
        if (i >= r8lambdawenh2zfjpauxgrrcztm8m6cjb0.IconCompatParcelizer) {
            return new r8lambdaWEnH2ZfJpAuXGrRCztM8m6cjB0(Arrays.copyOf(r8lambdawenh2zfjpauxgrrcztm8m6cjb0.serializer, i), r8lambdawenh2zfjpauxgrrcztm8m6cjb0.IconCompatParcelizer, true);
        }
        DrawableTransformation.write();
        return null;
    }

    public static getFlagCount mutableCopy(getFlagCount getflagcount) {
        int size = getflagcount.size();
        int i = size == 0 ? 10 : size * 2;
        getRequestInitiationTime getrequestinitiationtime = (getRequestInitiationTime) getflagcount;
        if (i >= getrequestinitiationtime.IconCompatParcelizer) {
            return new getRequestInitiationTime(Arrays.copyOf(getrequestinitiationtime.serializer, i), getrequestinitiationtime.IconCompatParcelizer, true);
        }
        DrawableTransformation.write();
        return null;
    }

    public static isTimestampOlderThan mutableCopy(isTimestampOlderThan istimestampolderthan) {
        int size = istimestampolderthan.size();
        int i = size == 0 ? 10 : size * 2;
        accesssetDiskLruCachep accesssetdisklrucachep = (accesssetDiskLruCachep) istimestampolderthan;
        if (i >= accesssetdisklrucachep.IconCompatParcelizer) {
            return new accesssetDiskLruCachep(Arrays.copyOf(accesssetdisklrucachep.RemoteActionCompatParcelizer, i), accesssetdisklrucachep.IconCompatParcelizer, true);
        }
        DrawableTransformation.write();
        return null;
    }

    @Override // o.accessgetDiskLruCachep
    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public static ContentCardsUpdatedEventCompanion mutableCopy(ContentCardsUpdatedEventCompanion contentCardsUpdatedEventCompanion) {
        int size = contentCardsUpdatedEventCompanion.size();
        int i = size == 0 ? 10 : size * 2;
        r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4 r8lambdad9d8zanadasmqv1rdea0gwxvs4 = (r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4) contentCardsUpdatedEventCompanion;
        if (i >= r8lambdad9d8zanadasmqv1rdea0gwxvs4.IconCompatParcelizer) {
            return new r8lambdad9d8zanaDaSMqv1RdEA0gwxVS4(Arrays.copyOf(r8lambdad9d8zanadasmqv1rdea0gwxvs4.write, i), r8lambdad9d8zanadasmqv1rdea0gwxvs4.IconCompatParcelizer, true);
        }
        DrawableTransformation.write();
        return null;
    }

    public static <E> onSuccess mutableCopy(onSuccess onsuccess) {
        int size = onsuccess.size();
        return onsuccess.read(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, ByteString byteString) throws InvalidProtocolBufferException {
        T t2 = (T) parseFrom(t, byteString, DelayedInitializationAnalyticsBehavior.write());
        a(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, byte[] bArr) throws InvalidProtocolBufferException {
        T t2 = (T) a(t, bArr, 0, bArr.length, DelayedInitializationAnalyticsBehavior.write());
        a(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, byte[] bArr, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        T t2 = (T) a(t, bArr, 0, bArr.length, delayedInitializationAnalyticsBehavior);
        a(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, u.IconCompatParcelizer(inputStream), DelayedInitializationAnalyticsBehavior.write());
        a(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, u.IconCompatParcelizer(inputStream), delayedInitializationAnalyticsBehavior);
        a(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, u uVar) throws InvalidProtocolBufferException {
        return (T) parseFrom(t, uVar, DelayedInitializationAnalyticsBehavior.write());
    }

    @Override // o.accessgetDiskCacheLockp
    public int getSerializedSize() {
        return getSerializedSize(null);
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, u uVar, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        T t2 = (T) parsePartialFrom(t, uVar, delayedInitializationAnalyticsBehavior);
        a(t2);
        return t2;
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (T) parseFrom(t, byteBuffer, DelayedInitializationAnalyticsBehavior.write());
    }

    public static <T extends GeneratedMessageLite> T parseFrom(T t, ByteString byteString, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        u uVarRemoteActionCompatParcelizer = byteString.RemoteActionCompatParcelizer();
        T t2 = (T) parsePartialFrom(t, uVarRemoteActionCompatParcelizer, delayedInitializationAnalyticsBehavior);
        try {
            uVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(0);
            a(t2);
            return t2;
        } catch (InvalidProtocolBufferException e) {
            e.write(t2);
            throw e;
        }
    }

    public static void a(GeneratedMessageLite generatedMessageLite) throws InvalidProtocolBufferException {
        if (generatedMessageLite == null || generatedMessageLite.isInitialized()) {
            return;
        }
        InvalidProtocolBufferException invalidProtocolBufferException = new InvalidProtocolBufferException(generatedMessageLite.newUninitializedMessageException().getMessage());
        invalidProtocolBufferException.write(generatedMessageLite);
        throw invalidProtocolBufferException;
    }

    public static <T extends GeneratedMessageLite> T parsePartialFrom(T t, u uVar) throws InvalidProtocolBufferException {
        return (T) parsePartialFrom(t, uVar, DelayedInitializationAnalyticsBehavior.write());
    }

    public static GeneratedMessageLite a(GeneratedMessageLite generatedMessageLite, InputStream inputStream, DelayedInitializationAnalyticsBehavior delayedInitializationAnalyticsBehavior) throws InvalidProtocolBufferException {
        try {
            int i = inputStream.read();
            if (i == -1) {
                return null;
            }
            u uVarIconCompatParcelizer = u.IconCompatParcelizer(new getTimestampSeconds(inputStream, u.read(i, inputStream), 0));
            GeneratedMessageLite partialFrom = parsePartialFrom(generatedMessageLite, uVarIconCompatParcelizer, delayedInitializationAnalyticsBehavior);
            try {
                uVarIconCompatParcelizer.RemoteActionCompatParcelizer(0);
                return partialFrom;
            } catch (InvalidProtocolBufferException e) {
                e.write(partialFrom);
                throw e;
            }
        } catch (InvalidProtocolBufferException e2) {
            if (e2.MediaMetadataCompat()) {
                throw new InvalidProtocolBufferException(e2);
            }
            throw e2;
        } catch (IOException e3) {
            throw new InvalidProtocolBufferException(e3);
        }
    }
}
