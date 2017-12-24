/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, {Component} from "react";
import {StyleSheet, Text, View} from "react-native";

export default class second extends Component {

    constructor(pros){
        super(pros);
        console.log("lidexian ", 'constructor pros  '+pros);
    }

    componentWillMount(){
        console.log("lidexian ", 'second componentWillMount ');
    }

    render() {
        console.log("lidexian ", 'second render ');
        return (
            <View style={styles.container}>
                <Text style={styles.welcome}>
                    Welcome to React Native!
                </Text>
                <Text style={styles.instructions}>
                    To get started, edit App.js
                </Text>
                <Text style={styles.instructions}>
                    {'loadApp方法中调用了createRootView创建了ReactRootView，即React Native界面，并且将界面设置到Activity中。那么问题很可能出现在这了。插个断点loadApp方法中调用了createRootView创建了ReactRootView，即React Native界面，并且将界面设置到Activity中。那么问题很可能出现在这了。插个断点，调试看看执行时间loadApp方法中调用了createRootView创建了ReactRootView，即React Native界面，并且将界面设置到Activity中。那么问题很可能出现在这了。插个断点，调试看看执行时间loadApp方法中调用了createRootView创建了ReactRootView，即React Native界面，并且将界面设置到Activity中。那么问题很可能出现在这了。插个断点，调试看看执行时间loadApp方法中调用了createRootView创建了ReactRootView，即React Native界面，并且将界面设置到Activity中。那么问题很可能出现在这了。插个断点，调试看看执行时间loadApp方法中调用了createRootView创建了ReactRootView，即React Native界面，并且将界面设置到Activity中。那么问题很可能出现在这了。插个断点，调试看看执行时间loadApp方法中调用了createRootView创建了ReactRootView，即React Native界面，并且将界面设置到Activity中。那么问题很可能出现在这了。插个断点，调试看看执行时间loadApp方法中调用了createRootView创建了ReactRootView，即React Native界面，并且将界面设置到Activity中。那么问题很可能出现在这了。插个断点，调试看看执行时间loadApp方法中调用了createRootView创建了ReactRootView，即React Native界面，并且将界面设置到Activity中。那么问题很可能出现在这了。插个断点，调试看看执行时间loadApp方法中调用了createRootView创建了ReactRootView，即React Native界面，并且将界面设置到Activity中。那么问题很可能出现在这了。插个断点，调试看看执行时间loadApp方法中调用了createRootView创建了ReactRootView，即React Native界面，并且将界面设置到Activity中。那么问题很可能出现在这了。插个断点，调试看看执行时间loadApp方法中调用了createRootView创建了ReactRootView，即React Native界面，并且将界面设置到Activity中。那么问题很可能出现在这了。插个断点，调试看看执行时间loadApp方法中调用了createRootView创建了ReactRootView，即React Native界面，并且将界面设置到Activity中。那么问题很可能出现在这了。插个断点，调试看看执行时间loadApp方法中调用了createRootView创建了ReactRootView，即React Native界面，并且将界面设置到Activity中。那么问题很可能出现在这了。插个断点，调试看看执行时间loadApp方法中调用了createRootView创建了ReactRootView，即React Native界面，并且将界面设置到Activity中。那么问题很可能出现在这了。插个断点，调试看看执行时间，调试看看执行时间'}
                </Text>
            </View>
        );
    }

    componentDidMount(){
        console.log("lidexian ", 'second componentDidMount ');
    }

}



const styles = StyleSheet.create({
    container: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
        backgroundColor: '#F5FCFF',
    },
    welcome: {
        fontSize: 20,
        textAlign: 'center',
        margin: 10,
    },
    instructions: {
        textAlign: 'center',
        color: '#333333',
        marginBottom: 5,
    },
});
