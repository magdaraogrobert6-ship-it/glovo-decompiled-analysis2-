package com.deliveryhero.fwf_util;

import kotlinx.coroutines.DelayKt;
import kotlinx.serialization.SerializationException;
import o.BackgroundInAppMessagePreparerWhenMappings;
import o.createFromParcel;
import o.onTouch;
import o.prepareInAppMessageWithHtml;
import o.prepareInAppMessageWithZippedAssetHtml;
import o.prepareInAppMessageWithZippedAssetHtmllambda4;
import o.r8lambdaFtZoxUVZSzQ6UwcDD4feyGxXgXg;
import o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM;
import o.r8lambdafvzP3Wky1RLLzE56uVXaMHcvU;
import o.removeNodeAtDepth;
import o.resetTransientState;

/* JADX INFO: loaded from: classes2.dex */
public final class FwFSerializer {
    private final resetTransientState json = DelayKt.serializer(new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.deliveryhero.fwf_util.FwFSerializer$json$1
        public final void invoke(onTouch ontouch) {
            ontouch.getClass();
            ontouch.MediaSessionCompatQueueItem = true;
            ontouch.MediaDescriptionCompat = true;
        }

        @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((onTouch) obj);
            return createFromParcel.INSTANCE;
        }
    });
    private final prepareInAppMessageWithZippedAssetHtmllambda4 protoBuf;

    /* JADX INFO: Access modifiers changed from: private */
    public final String getDecodingError(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Decoding failed: ", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getEncodingError(String str) {
        return r8lambdafvzP3Wky1RLLzE56uVXaMHcvU.serializer("Encoding failed: ", str);
    }

    public FwFSerializer() {
        FwFSerializer$protoBuf$1 fwFSerializer$protoBuf$1 = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.deliveryhero.fwf_util.FwFSerializer$protoBuf$1
            @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((prepareInAppMessageWithHtml) obj);
                return createFromParcel.INSTANCE;
            }

            public final void invoke(prepareInAppMessageWithHtml prepareinappmessagewithhtml) {
                prepareinappmessagewithhtml.getClass();
            }
        };
        BackgroundInAppMessagePreparerWhenMappings backgroundInAppMessagePreparerWhenMappings = prepareInAppMessageWithZippedAssetHtmllambda4.write;
        backgroundInAppMessagePreparerWhenMappings.getClass();
        fwFSerializer$protoBuf$1.getClass();
        prepareInAppMessageWithHtml prepareinappmessagewithhtml = new prepareInAppMessageWithHtml();
        prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml = backgroundInAppMessagePreparerWhenMappings.RemoteActionCompatParcelizer;
        fwFSerializer$protoBuf$1.invoke((Object) prepareinappmessagewithhtml);
        prepareinappmessagewithzippedassethtml.getClass();
        this.protoBuf = new r8lambdaFtZoxUVZSzQ6UwcDD4feyGxXgXg(prepareinappmessagewithzippedassethtml);
    }

    public final <T> T decodeJsonCatching$fwf_client_release(String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        str.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        try {
            prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml = this.json.RemoteActionCompatParcelizer;
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        } catch (SerializationException e) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getDecodingError(String.valueOf(e)));
            return null;
        } catch (IllegalArgumentException e2) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getDecodingError(String.valueOf(e2)));
            return null;
        }
    }

    public final <T> T decodeProtoCatching$fwf_client_release(byte[] bArr, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        bArr.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        try {
            prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml = this.protoBuf.RemoteActionCompatParcelizer;
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        } catch (SerializationException e) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getDecodingError(String.valueOf(e)));
            return null;
        } catch (IllegalArgumentException e2) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getDecodingError(String.valueOf(e2)));
            return null;
        }
    }

    public static Object decodeJsonCatching$fwf_client_release$default(FwFSerializer fwFSerializer, String str, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 2) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.deliveryhero.fwf_util.FwFSerializer$decodeJsonCatching$1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((String) obj2);
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(String str2) {
                    str2.getClass();
                }
            };
        }
        str.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        try {
            prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml = fwFSerializer.json.RemoteActionCompatParcelizer;
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        } catch (SerializationException e) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(fwFSerializer.getDecodingError(String.valueOf(e)));
            return null;
        } catch (IllegalArgumentException e2) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(fwFSerializer.getDecodingError(String.valueOf(e2)));
            return null;
        }
    }

    public static Object decodeProtoCatching$fwf_client_release$default(FwFSerializer fwFSerializer, byte[] bArr, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj) {
        if ((i & 2) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.deliveryhero.fwf_util.FwFSerializer$decodeProtoCatching$1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((String) obj2);
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(String str) {
                    str.getClass();
                }
            };
        }
        bArr.getClass();
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        try {
            prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml = fwFSerializer.protoBuf.RemoteActionCompatParcelizer;
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        } catch (SerializationException e) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(fwFSerializer.getDecodingError(String.valueOf(e)));
            return null;
        } catch (IllegalArgumentException e2) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(fwFSerializer.getDecodingError(String.valueOf(e2)));
            return null;
        }
    }

    public static String encodeJsonCatching$fwf_client_release$default(FwFSerializer fwFSerializer, Object obj, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj2) {
        if ((i & 2) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.deliveryhero.fwf_util.FwFSerializer$encodeJsonCatching$1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((String) obj3);
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(String str) {
                    str.getClass();
                }
            };
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        try {
            prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml = fwFSerializer.json.RemoteActionCompatParcelizer;
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        } catch (SerializationException e) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(fwFSerializer.getEncodingError(String.valueOf(e)));
            return null;
        } catch (IllegalArgumentException e2) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(fwFSerializer.getEncodingError(String.valueOf(e2)));
            return null;
        }
    }

    public static byte[] encodeProtoCatching$fwf_client_release$default(FwFSerializer fwFSerializer, Object obj, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm, int i, Object obj2) {
        if ((i & 2) != 0) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm = new r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM() { // from class: com.deliveryhero.fwf_util.FwFSerializer$encodeProtoCatching$1
                @Override // o.r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM
                public /* bridge */ /* synthetic */ Object invoke(Object obj3) {
                    invoke((String) obj3);
                    return createFromParcel.INSTANCE;
                }

                public final void invoke(String str) {
                    str.getClass();
                }
            };
        }
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        try {
            prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml = fwFSerializer.protoBuf.RemoteActionCompatParcelizer;
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        } catch (SerializationException e) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(fwFSerializer.getEncodingError(String.valueOf(e)));
            return null;
        } catch (IllegalArgumentException e2) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(fwFSerializer.getEncodingError(String.valueOf(e2)));
            return null;
        }
    }

    public final <T> String encodeJsonCatching$fwf_client_release(T t, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        try {
            prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml = this.json.RemoteActionCompatParcelizer;
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        } catch (SerializationException e) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getEncodingError(String.valueOf(e)));
            return null;
        } catch (IllegalArgumentException e2) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getEncodingError(String.valueOf(e2)));
            return null;
        }
    }

    public final <T> byte[] encodeProtoCatching$fwf_client_release(T t, r8lambdaUNavO3sxuB_PC9xRoryoTNrlvSM r8lambdaunavo3sxub_pc9xroryotnrlvsm) {
        r8lambdaunavo3sxub_pc9xroryotnrlvsm.getClass();
        try {
            prepareInAppMessageWithZippedAssetHtml prepareinappmessagewithzippedassethtml = this.protoBuf.RemoteActionCompatParcelizer;
            removeNodeAtDepth.IconCompatParcelizer();
            throw null;
        } catch (SerializationException e) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getEncodingError(String.valueOf(e)));
            return null;
        } catch (IllegalArgumentException e2) {
            r8lambdaunavo3sxub_pc9xroryotnrlvsm.invoke(getEncodingError(String.valueOf(e2)));
            return null;
        }
    }
}
