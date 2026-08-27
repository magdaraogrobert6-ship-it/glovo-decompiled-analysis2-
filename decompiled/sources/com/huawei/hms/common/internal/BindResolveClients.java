package com.huawei.hms.common.internal;

import java.util.ArrayList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes2.dex */
public class BindResolveClients {
    private static final Object b = new Object();
    private ArrayList<ResolveClientBean> a;

    public static class b {
        private static final BindResolveClients a = new BindResolveClients();
    }

    public static BindResolveClients getInstance() {
        return b.a;
    }

    public boolean isClientRegistered(ResolveClientBean resolveClientBean) {
        boolean zContains;
        synchronized (b) {
            zContains = this.a.contains(resolveClientBean);
        }
        return zContains;
    }

    public void notifyClientReconnect() {
        synchronized (b) {
            ListIterator<ResolveClientBean> listIterator = this.a.listIterator();
            while (listIterator.hasNext()) {
                listIterator.next().clientReconnect();
            }
            this.a.clear();
        }
    }

    public void unRegisterAll() {
        synchronized (b) {
            this.a.clear();
        }
    }

    public void register(ResolveClientBean resolveClientBean) {
        if (resolveClientBean == null) {
            return;
        }
        synchronized (b) {
            if (!this.a.contains(resolveClientBean)) {
                this.a.add(resolveClientBean);
            }
        }
    }

    public void unRegister(ResolveClientBean resolveClientBean) {
        if (resolveClientBean == null) {
            return;
        }
        synchronized (b) {
            if (this.a.contains(resolveClientBean)) {
                ListIterator<ResolveClientBean> listIterator = this.a.listIterator();
                while (listIterator.hasNext()) {
                    if (resolveClientBean.equals(listIterator.next())) {
                        listIterator.remove();
                        break;
                    }
                }
            }
        }
    }

    private BindResolveClients() {
        this.a = new ArrayList<>();
    }
}
