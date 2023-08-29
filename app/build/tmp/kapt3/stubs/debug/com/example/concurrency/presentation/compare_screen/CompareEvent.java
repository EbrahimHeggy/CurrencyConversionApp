package com.example.concurrency.presentation.compare_screen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b\u00a8\u0006\f"}, d2 = {"Lcom/example/concurrency/presentation/compare_screen/CompareEvent;", "", "GetComparedCurrency", "SetBase", "SetBaseAmount", "SetTarget1", "SetTarget2", "Lcom/example/concurrency/presentation/compare_screen/CompareEvent$GetComparedCurrency;", "Lcom/example/concurrency/presentation/compare_screen/CompareEvent$SetBase;", "Lcom/example/concurrency/presentation/compare_screen/CompareEvent$SetBaseAmount;", "Lcom/example/concurrency/presentation/compare_screen/CompareEvent$SetTarget1;", "Lcom/example/concurrency/presentation/compare_screen/CompareEvent$SetTarget2;", "app_debug"})
public abstract interface CompareEvent {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0010\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u001b"}, d2 = {"Lcom/example/concurrency/presentation/compare_screen/CompareEvent$GetComparedCurrency;", "Lcom/example/concurrency/presentation/compare_screen/CompareEvent;", "amount", "", "base", "", "target1", "target2", "(DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()D", "getBase", "()Ljava/lang/String;", "getTarget1", "getTarget2", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class GetComparedCurrency implements com.example.concurrency.presentation.compare_screen.CompareEvent {
        private final double amount = 0.0;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String base = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String target1 = null;
        @org.jetbrains.annotations.NotNull
        private final java.lang.String target2 = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.presentation.compare_screen.CompareEvent.GetComparedCurrency copy(double amount, @org.jetbrains.annotations.NotNull
        java.lang.String base, @org.jetbrains.annotations.NotNull
        java.lang.String target1, @org.jetbrains.annotations.NotNull
        java.lang.String target2) {
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
        
        public GetComparedCurrency(double amount, @org.jetbrains.annotations.NotNull
        java.lang.String base, @org.jetbrains.annotations.NotNull
        java.lang.String target1, @org.jetbrains.annotations.NotNull
        java.lang.String target2) {
            super();
        }
        
        public final double component1() {
            return 0.0;
        }
        
        public final double getAmount() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getBase() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTarget1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String component4() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getTarget2() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/example/concurrency/presentation/compare_screen/CompareEvent$SetBaseAmount;", "Lcom/example/concurrency/presentation/compare_screen/CompareEvent;", "amount", "", "(Ljava/lang/String;)V", "getAmount", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class SetBaseAmount implements com.example.concurrency.presentation.compare_screen.CompareEvent {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String amount = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.presentation.compare_screen.CompareEvent.SetBaseAmount copy(@org.jetbrains.annotations.NotNull
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
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/concurrency/presentation/compare_screen/CompareEvent$SetBase;", "Lcom/example/concurrency/presentation/compare_screen/CompareEvent;", "base", "Lcom/example/concurrency/presentation/convert_screen/Base;", "(Lcom/example/concurrency/presentation/convert_screen/Base;)V", "getBase", "()Lcom/example/concurrency/presentation/convert_screen/Base;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class SetBase implements com.example.concurrency.presentation.compare_screen.CompareEvent {
        @org.jetbrains.annotations.NotNull
        private final com.example.concurrency.presentation.convert_screen.Base base = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.presentation.compare_screen.CompareEvent.SetBase copy(@org.jetbrains.annotations.NotNull
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
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/concurrency/presentation/compare_screen/CompareEvent$SetTarget1;", "Lcom/example/concurrency/presentation/compare_screen/CompareEvent;", "target1", "Lcom/example/concurrency/presentation/convert_screen/Target;", "(Lcom/example/concurrency/presentation/convert_screen/Target;)V", "getTarget1", "()Lcom/example/concurrency/presentation/convert_screen/Target;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class SetTarget1 implements com.example.concurrency.presentation.compare_screen.CompareEvent {
        @org.jetbrains.annotations.NotNull
        private final com.example.concurrency.presentation.convert_screen.Target target1 = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.presentation.compare_screen.CompareEvent.SetTarget1 copy(@org.jetbrains.annotations.NotNull
        com.example.concurrency.presentation.convert_screen.Target target1) {
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
        
        public SetTarget1(@org.jetbrains.annotations.NotNull
        com.example.concurrency.presentation.convert_screen.Target target1) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.presentation.convert_screen.Target component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.presentation.convert_screen.Target getTarget1() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/example/concurrency/presentation/compare_screen/CompareEvent$SetTarget2;", "Lcom/example/concurrency/presentation/compare_screen/CompareEvent;", "target2", "Lcom/example/concurrency/presentation/convert_screen/Target;", "(Lcom/example/concurrency/presentation/convert_screen/Target;)V", "getTarget2", "()Lcom/example/concurrency/presentation/convert_screen/Target;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class SetTarget2 implements com.example.concurrency.presentation.compare_screen.CompareEvent {
        @org.jetbrains.annotations.NotNull
        private final com.example.concurrency.presentation.convert_screen.Target target2 = null;
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.presentation.compare_screen.CompareEvent.SetTarget2 copy(@org.jetbrains.annotations.NotNull
        com.example.concurrency.presentation.convert_screen.Target target2) {
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
        
        public SetTarget2(@org.jetbrains.annotations.NotNull
        com.example.concurrency.presentation.convert_screen.Target target2) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.presentation.convert_screen.Target component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.concurrency.presentation.convert_screen.Target getTarget2() {
            return null;
        }
    }
}