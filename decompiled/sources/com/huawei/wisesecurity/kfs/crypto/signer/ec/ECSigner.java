package com.huawei.wisesecurity.kfs.crypto.signer.ec;

import com.huawei.wisesecurity.kfs.crypto.signer.DefaultSignHandler;
import com.huawei.wisesecurity.kfs.exception.CryptoException;
import com.huawei.wisesecurity.ucs_credential.x;
import java.security.PrivateKey;
import java.security.PublicKey;
import o.AppendedSemanticsElement;
import o.getCanScrollVertically;
import o.getLabel;
import o.getMergeDescendants;
import o.visitScrollCaptureCandidatesdefault;

/* JADX INFO: loaded from: classes2.dex */
public final class ECSigner implements getMergeDescendants {
    public final getCanScrollVertically IconCompatParcelizer;
    public final PublicKey RemoteActionCompatParcelizer;
    public final /* synthetic */ int read;
    public final PrivateKey serializer;
    public final visitScrollCaptureCandidatesdefault write;

    public /* synthetic */ ECSigner(getCanScrollVertically getcanscrollvertically, visitScrollCaptureCandidatesdefault visitscrollcapturecandidatesdefault, PrivateKey privateKey, PublicKey publicKey, int i) {
        this.read = i;
        this.IconCompatParcelizer = getcanscrollvertically;
        this.write = visitscrollcapturecandidatesdefault;
        this.serializer = privateKey;
        this.RemoteActionCompatParcelizer = publicKey;
    }

    @Override // o.getMergeDescendants
    public final getLabel getSignHandler() throws CryptoException {
        int i = this.read;
        getCanScrollVertically getcanscrollvertically = this.IconCompatParcelizer;
        PrivateKey privateKey = this.serializer;
        visitScrollCaptureCandidatesdefault visitscrollcapturecandidatesdefault = this.write;
        if (i != 0) {
            x xVar = new x(12);
            xVar.IconCompatParcelizer = visitscrollcapturecandidatesdefault;
            if (privateKey != null) {
                return new DefaultSignHandler(getcanscrollvertically, privateKey, xVar);
            }
            throw new CryptoException("privateKey is invalid.");
        }
        x xVar2 = new x(12);
        xVar2.IconCompatParcelizer = visitscrollcapturecandidatesdefault;
        if (privateKey != null) {
            return new DefaultSignHandler(getcanscrollvertically, privateKey, xVar2);
        }
        throw new CryptoException("privateKey is invalid.");
    }

    @Override // o.getMergeDescendants
    public final AppendedSemanticsElement getVerifyHandler() throws CryptoException {
        int i = this.read;
        getCanScrollVertically getcanscrollvertically = this.IconCompatParcelizer;
        PublicKey publicKey = this.RemoteActionCompatParcelizer;
        visitScrollCaptureCandidatesdefault visitscrollcapturecandidatesdefault = this.write;
        if (i != 0) {
            x xVar = new x(12);
            xVar.IconCompatParcelizer = visitscrollcapturecandidatesdefault;
            if (publicKey != null) {
                return new DefaultSignHandler(getcanscrollvertically, publicKey, xVar);
            }
            throw new CryptoException("publicKey is invalid.");
        }
        x xVar2 = new x(12);
        xVar2.IconCompatParcelizer = visitscrollcapturecandidatesdefault;
        if (publicKey != null) {
            return new DefaultSignHandler(getcanscrollvertically, publicKey, xVar2);
        }
        throw new CryptoException("publicKey is invalid.");
    }
}
