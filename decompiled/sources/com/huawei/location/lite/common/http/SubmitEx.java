package com.huawei.location.lite.common.http;

import android.text.TextUtils;
import androidx.recyclerview.widget.ChildHelper;
import com.google.gson.Gson;
import com.huawei.hmf.tasks.a.i$d;
import com.huawei.location.base.activity.constant.ActivityErrorCode;
import com.huawei.location.lite.common.http.exception.AuthException;
import com.huawei.location.lite.common.http.response.BaseResponse;
import com.huawei.location.lite.common.report.ReportBuilder;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import o.WrappedCompositionsetContent1;
import o.WrappedCompositionsetContent12;
import o.WrappedCompositionsetContent1211;
import o.WrappedCompositionsetContent1ExternalSyntheticLambda0;
import o.accessgetDisposedp;
import o.accesssetAddedToLifecyclep;
import o.accesssetLastContentp;
import o.getOriginal;
import o.isDisposed;
import o.r8lambdaTh5XutLsugSVCPGs8FSo2qiHMVU;
import o.resolveResourcePath;

/* JADX INFO: loaded from: classes2.dex */
public final class SubmitEx {
    public final accessgetDisposedp IconCompatParcelizer;
    public final resolveResourcePath RemoteActionCompatParcelizer;
    public final WrappedCompositionsetContent12 serializer;

    /* JADX INFO: loaded from: classes5.dex */
    class TempResponse extends BaseResponse {
        @Override // com.huawei.location.lite.common.http.response.BaseResponse
        public String getApiCode() {
            return this.code;
        }

        private TempResponse() {
        }

        @Override // com.huawei.location.lite.common.http.response.BaseResponse
        public boolean isSuccess() {
            return TextUtils.isEmpty(this.code) || "0".equals(this.code);
        }
    }

    public SubmitEx(WrappedCompositionsetContent12 wrappedCompositionsetContent12, accessgetDisposedp accessgetdisposedp) {
        this.IconCompatParcelizer = accessgetdisposedp;
        this.serializer = wrappedCompositionsetContent12;
        resolveResourcePath resolveresourcepath = new resolveResourcePath(1);
        resolveresourcepath.write = null;
        ReportBuilder reportBuilder = new ReportBuilder();
        resolveresourcepath.write = reportBuilder;
        reportBuilder.setCallTime();
        this.RemoteActionCompatParcelizer = resolveresourcepath;
    }

    public final byte[] serializer() {
        byte[] bArr = (byte[]) IconCompatParcelizer().serializer.serializer;
        if (bArr != null && bArr.length > 0) {
            this.RemoteActionCompatParcelizer.serializer(this.serializer, String.valueOf(200), isDisposed.serializer(200));
        }
        return bArr;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00e2 A[Catch: all -> 0x0116, TryCatch #12 {all -> 0x0116, blocks: (B:63:0x00d7, B:64:0x00d9, B:68:0x00de, B:70:0x00e2, B:72:0x0110, B:73:0x0115, B:71:0x00e8), top: B:80:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00e8 A[Catch: all -> 0x0116, TryCatch #12 {all -> 0x0116, blocks: (B:63:0x00d7, B:64:0x00d9, B:68:0x00de, B:70:0x00e2, B:72:0x0110, B:73:0x0115, B:71:0x00e8), top: B:80:0x0017 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:71:0x00e8, please report this as an issue */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x0117: MOVE (r5 I:??[long, double]) = (r15 I:??[long, double]), block:B:75:0x0117 */
    public final accesssetLastContentp IconCompatParcelizer() throws Throwable {
        long j;
        long j2;
        isDisposed isdisposedWrite;
        isDisposed isdisposed;
        WrappedCompositionsetContent12 wrappedCompositionsetContent12 = this.serializer;
        resolveResourcePath resolveresourcepath = this.RemoteActionCompatParcelizer;
        accessgetDisposedp accessgetdisposedp = this.IconCompatParcelizer;
        ArrayList arrayList = accessgetdisposedp.write;
        WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SubmitEx", "fetch info from server by network start...");
        try {
            try {
                accesssetAddedToLifecyclep accesssetaddedtolifecyclepWrite = getOriginal.write(wrappedCompositionsetContent12.RatingCompat);
                if (accesssetaddedtolifecyclepWrite != null) {
                    arrayList.add(0, accesssetaddedtolifecyclepWrite);
                }
                arrayList.add(new r8lambdaTh5XutLsugSVCPGs8FSo2qiHMVU(1));
                i$d.a aVar = new i$d.a(15, accessgetdisposedp.IconCompatParcelizer);
                if (arrayList.size() <= 0) {
                    throw new AssertionError();
                }
                accesssetLastContentp accesssetlastcontentp = ((accesssetAddedToLifecyclep) arrayList.get(0)).read(new ChildHelper(accessgetdisposedp, wrappedCompositionsetContent12, arrayList, 1, aVar));
                if (accesssetlastcontentp == null) {
                    throw new WrappedCompositionsetContent1ExternalSyntheticLambda0(isDisposed.write(10307));
                }
                if (accesssetlastcontentp.serializer != null) {
                    j = accesssetlastcontentp.write - accesssetlastcontentp.MediaMetadataCompat;
                    try {
                        int i = accesssetlastcontentp.RemoteActionCompatParcelizer;
                        if (i >= 200 && i < 300) {
                            WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SubmitEx", "fetch info from server by network end...");
                            resolveresourcepath.write.setExtParam("httpSdkCostTime", j + "");
                            return accesssetlastcontentp;
                        }
                        isdisposedWrite = isDisposed.write(i);
                        try {
                            throw new WrappedCompositionsetContent1ExternalSyntheticLambda0(isdisposedWrite);
                        } catch (IOException e) {
                            e = e;
                        } catch (WrappedCompositionsetContent1 e2) {
                            e = e2;
                            isDisposed isdisposed2 = e.serializer;
                            throw e;
                        } catch (WrappedCompositionsetContent1ExternalSyntheticLambda0 e3) {
                            e = e3;
                            isDisposed isdisposed3 = e.serializer;
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (IOException e4) {
                        e = e4;
                    } catch (WrappedCompositionsetContent1 e5) {
                        e = e5;
                        isDisposed isdisposed4 = e.serializer;
                        throw e;
                    } catch (WrappedCompositionsetContent1ExternalSyntheticLambda0 e6) {
                        e = e6;
                        isDisposed isdisposed5 = e.serializer;
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        isdisposedWrite = null;
                    }
                    if (e instanceof AuthException) {
                        isdisposed = ((AuthException) e).serializer;
                    } else {
                        isdisposed = new isDisposed(ActivityErrorCode.ENABLE_CONVERSION_EVENT_FAILED, isDisposed.serializer(ActivityErrorCode.ENABLE_CONVERSION_EVENT_FAILED) + ":" + e.getClass().getSimpleName());
                    }
                    throw new WrappedCompositionsetContent1ExternalSyntheticLambda0(isdisposed);
                }
                isdisposedWrite = isDisposed.write(10307);
                try {
                    throw new WrappedCompositionsetContent1ExternalSyntheticLambda0(isdisposedWrite);
                } catch (IOException e7) {
                    e = e7;
                    if (e instanceof AuthException) {
                        isdisposed = ((AuthException) e).serializer;
                    } else {
                        isdisposed = new isDisposed(ActivityErrorCode.ENABLE_CONVERSION_EVENT_FAILED, isDisposed.serializer(ActivityErrorCode.ENABLE_CONVERSION_EVENT_FAILED) + ":" + e.getClass().getSimpleName());
                    }
                    throw new WrappedCompositionsetContent1ExternalSyntheticLambda0(isdisposed);
                } catch (WrappedCompositionsetContent1 e8) {
                    e = e8;
                    isDisposed isdisposed6 = e.serializer;
                    throw e;
                } catch (WrappedCompositionsetContent1ExternalSyntheticLambda0 e9) {
                    e = e9;
                    isDisposed isdisposed7 = e.serializer;
                    throw e;
                } catch (Throwable th3) {
                    th = th3;
                    j = -1;
                }
                WrappedCompositionsetContent1211.RemoteActionCompatParcelizer("SubmitEx", "fetch info from server by network end...");
                resolveresourcepath.write.setExtParam("httpSdkCostTime", j + "");
                if (isdisposedWrite != null) {
                    resolveresourcepath.serializer(wrappedCompositionsetContent12, String.valueOf(isdisposedWrite.serializer), String.valueOf(isdisposedWrite.read));
                }
                throw th;
            } catch (Throwable th4) {
                th = th4;
                j = j2;
            }
        } catch (IOException e10) {
            e = e10;
        } catch (WrappedCompositionsetContent1 e11) {
            e = e11;
            isDisposed isdisposed8 = e.serializer;
            throw e;
        } catch (WrappedCompositionsetContent1ExternalSyntheticLambda0 e12) {
            e = e12;
            isDisposed isdisposed9 = e.serializer;
            throw e;
        } catch (Throwable th5) {
            th = th5;
            j = -1;
        }
    }

    public final BaseResponse RemoteActionCompatParcelizer(Class cls) throws WrappedCompositionsetContent1, WrappedCompositionsetContent1ExternalSyntheticLambda0 {
        String str = new String((byte[]) IconCompatParcelizer().serializer.serializer, StandardCharsets.UTF_8);
        resolveResourcePath resolveresourcepath = this.RemoteActionCompatParcelizer;
        WrappedCompositionsetContent12 wrappedCompositionsetContent12 = this.serializer;
        try {
            BaseResponse baseResponse = (BaseResponse) new Gson().fromJson(str, cls);
            if (baseResponse == null) {
                WrappedCompositionsetContent1211.read("SubmitEx", "param exception");
                resolveresourcepath.serializer(wrappedCompositionsetContent12, String.valueOf(10304), isDisposed.serializer(10304));
                throw new WrappedCompositionsetContent1ExternalSyntheticLambda0(isDisposed.write(10304));
            }
            if (baseResponse.isSuccess()) {
                resolveresourcepath.serializer(wrappedCompositionsetContent12, String.valueOf(200), isDisposed.serializer(200));
                return baseResponse;
            }
            resolveresourcepath.serializer(wrappedCompositionsetContent12, baseResponse.getApiCode(), baseResponse.getMsg());
            String apiCode = baseResponse.getApiCode();
            String msg = baseResponse.getMsg();
            WrappedCompositionsetContent1 wrappedCompositionsetContent1 = new WrappedCompositionsetContent1(isDisposed.write(10315));
            wrappedCompositionsetContent1.read = apiCode;
            wrappedCompositionsetContent1.RemoteActionCompatParcelizer = msg;
            throw wrappedCompositionsetContent1;
        } catch (Exception unused) {
            WrappedCompositionsetContent1211.read("SubmitEx", "getEntity exception body is :".concat(str));
            resolveresourcepath.serializer(wrappedCompositionsetContent12, String.valueOf(10304), isDisposed.serializer(10304));
            throw new WrappedCompositionsetContent1ExternalSyntheticLambda0(isDisposed.write(10304));
        }
    }
}
