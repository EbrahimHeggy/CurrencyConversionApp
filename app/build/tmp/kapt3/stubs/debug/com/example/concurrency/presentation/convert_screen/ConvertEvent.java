package com.example.concurrency.presentation.convert_screen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/example/concurrency/presentation/convert_screen/ConvertEvent;", "", "DeleteCurrency", "GetConvertedCurrency", "InitialScreen", "InsertCurrency", "SetBase", "SetBaseAmount", "SetTarget", "Lcom/example/concurrency/presentation/convert_screen/ConvertEvent$DeleteCurrency;", "Lcom/example/concurrency/presentation/convert_screen/ConvertEvent$GetConvertedCurrency;", "Lcom/example/concurrency/presentation/convert_screen/ConvertEvent$InitialScreen;", "Lcom/example/concurrency/presentation/convert_screen/ConvertEvent$InsertCurrency;", "Lcom/example/concurrency/presentation/convert_screen/ConvertEvent$SetBase;", "Lcom/example/concurrency/presentation/convert_screen/ConvertEvent$SetBaseAmount;", "Lcom/example/concurrency/presentation/convert_screen/ConvertEvent$SetTarget;", "app_debug"})
public abstract interface ConvertEvent {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J\'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/example/concurrency/presentation/convert_screen/ConvertEvent$GetConvertedCurrency;", "Lcom/example/concurrency/presentation/convert_screen/ConvertEvent;", "base", "", "target", "amount", "", "(Ljava/lang/String;Ljava/lang/String;D)V", "getAmount", "()D", "getBase", "()Ljava/lang/String;", "getTarget", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class GetConvertedCurrency implements com.example.concurrency.presentation.convert_screen.ConvertEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String base = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String target = null;
        private final double amount = 0.0;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.presentation.convert_screen.ConvertEvent.GetConvertedCurrency copy(@org.jetbrains.annotations.NotNull
        java.lang.String base, @org.jetbrains.annotations.NotNull
        java.lang.String target, double amount) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public GetConvertedCurrency(@org.jetbrains.annotations.NotNull
        java.lang.String base, @org.jetbrains.annotations.NotNull
        java.lang.String target, double amount) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getBase() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTarget() {
            return null;
        }
        
        public final double component3() {
            return 0.0;
        }
        
        public final double getAmount() {
            return 0.0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/concurrency/presentation/convert_screen/ConvertEvent$SetBaseAmount;", "Lcom/example/concurrency/presentation/convert_screen/ConvertEvent;", "amount", "", "(Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class SetBaseAmount implements com.example.concurrency.presentation.convert_screen.ConvertEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String amount = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.presentation.convert_screen.ConvertEvent.SetBaseAmount copy(@org.jetbrains.annotations.NotNull
        java.lang.String amount) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public SetBaseAmount(@org.jetbrains.annotations.NotNull
        java.lang.String amount) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getAmount() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/concurrency/presentation/convert_screen/ConvertEvent$SetBase;", "Lcom/example/concurrency/presentation/convert_screen/ConvertEvent;", "base", "Lcom/example/concurrency/presentation/convert_screen/Base;", "(Lcom/example/concurrency/presentation/convert_screen/Base;)V", "getBase", "()Lcom/example/concurrency/presentation/convert_screen/Base;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class SetBase implements com.example.concurrency.presentation.convert_screen.ConvertEvent {
        @org.jetbrains.annotations.NotNull
        private final com.example.concurrency.presentation.convert_screen.Base base = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.presentation.convert_screen.ConvertEvent.SetBase copy(@org.jetbrains.annotations.NotNull
        com.example.concurrency.presentation.convert_screen.Base base) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public SetBase(@org.jetbrains.annotations.NotNull
        com.example.concurrency.presentation.convert_screen.Base base) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.presentation.convert_screen.Base component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.presentation.convert_screen.Base getBase() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/concurrency/presentation/convert_screen/ConvertEvent$SetTarget;", "Lcom/example/concurrency/presentation/convert_screen/ConvertEvent;", "target", "Lcom/example/concurrency/presentation/convert_screen/Target;", "(Lcom/example/concurrency/presentation/convert_screen/Target;)V", "getTarget", "()Lcom/example/concurrency/presentation/convert_screen/Target;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class SetTarget implements com.example.concurrency.presentation.convert_screen.ConvertEvent {
        @org.jetbrains.annotations.NotNull
        private final com.example.concurrency.presentation.convert_screen.Target target = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.presentation.convert_screen.ConvertEvent.SetTarget copy(@org.jetbrains.annotations.NotNull
        com.example.concurrency.presentation.convert_screen.Target target) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public SetTarget(@org.jetbrains.annotations.NotNull
        com.example.concurrency.presentation.convert_screen.Target target) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.presentation.convert_screen.Target component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.presentation.convert_screen.Target getTarget() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/concurrency/presentation/convert_screen/ConvertEvent$InitialScreen;", "Lcom/example/concurrency/presentation/convert_screen/ConvertEvent;", "()V", "app_debug"})
    public static final class InitialScreen implements com.example.concurrency.presentation.convert_screen.ConvertEvent {
        @org.jetbrains.annotations.NotNull
        public static final com.example.concurrency.presentation.convert_screen.ConvertEvent.InitialScreen INSTANCE = null;
        
        private InitialScreen() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/concurrency/presentation/convert_screen/ConvertEvent$InsertCurrency;", "Lcom/example/concurrency/presentation/convert_screen/ConvertEvent;", "currencyEntity", "Lcom/example/concurrency/data/remote/model/DataX;", "(Lcom/example/concurrency/data/remote/model/DataX;)V", "getCurrencyEntity", "()Lcom/example/concurrency/data/remote/model/DataX;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class InsertCurrency implements com.example.concurrency.presentation.convert_screen.ConvertEvent {
        @org.jetbrains.annotations.NotNull
        private final com.example.concurrency.data.remote.model.DataX currencyEntity = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.presentation.convert_screen.ConvertEvent.InsertCurrency copy(@org.jetbrains.annotations.NotNull
        com.example.concurrency.data.remote.model.DataX currencyEntity) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public InsertCurrency(@org.jetbrains.annotations.NotNull
        com.example.concurrency.data.remote.model.DataX currencyEntity) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.data.remote.model.DataX component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.data.remote.model.DataX getCurrencyEntity() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/concurrency/presentation/convert_screen/ConvertEvent$DeleteCurrency;", "Lcom/example/concurrency/presentation/convert_screen/ConvertEvent;", "currencyEntity", "Lcom/example/concurrency/data/remote/model/DataX;", "(Lcom/example/concurrency/data/remote/model/DataX;)V", "getCurrencyEntity", "()Lcom/example/concurrency/data/remote/model/DataX;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class DeleteCurrency implements com.example.concurrency.presentation.convert_screen.ConvertEvent {
        @org.jetbrains.annotations.NotNull
        private final com.example.concurrency.data.remote.model.DataX currencyEntity = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.presentation.convert_screen.ConvertEvent.DeleteCurrency copy(@org.jetbrains.annotations.NotNull
        com.example.concurrency.data.remote.model.DataX currencyEntity) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull
        @java.lang.Override
        public java.lang.String toString() {
            return null;
        }
        
        public DeleteCurrency(@org.jetbrains.annotations.NotNull
        com.example.concurrency.data.remote.model.DataX currencyEntity) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.data.remote.model.DataX component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.data.remote.model.DataX getCurrencyEntity() {
            return null;
        }
    }
}