/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
  StyleSheet,
  Text,
  View
} from 'react-native';

export default class third extends Component{

  render() {
    console.log("lidexian ",'third render ');
    return (
      <View style={styles.container}>
        <Text style={styles.welcome}>
          Welcome to React Native!
        </Text>
        <Text style={styles.instructions}>
          To get started, edit App.js
        </Text>
        <Text style={styles.instructions}>
          {'承认自己软弱比故作坚强有用的多承认自己软弱比故作坚强有用的多小学时班里有个小胖子，那时我们给他起了很多外号，有“胖子”，“包子”，还有比较难听的“胖己软弱比故作坚强有用的多承认自己软弱比故作坚强有用的多小学时班里有个小胖子，那时我们给他起了很多外号，有“胖子”，“包子”，还有比较难听的“胖己软弱比故作坚强有用的多承认自己软弱比故作坚强有用的多小学时班里有个小胖子，那时我们给他起了很多外号，有“胖子”，“包子”，还有比较难听的“胖己软弱比故作坚强有用的多承认自己软弱比故作坚强有用的多小学时班里有个小胖子，那时我们给他起了很多外号，有“胖子”，“包子”，还有比较难听的“胖猪”。'}
        </Text>
      </View>
    );
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
