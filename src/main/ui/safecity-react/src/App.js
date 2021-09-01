import './App.css';
import React, { Component } from 'react'
import Home from './Home';

import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';

import CategoriaEdit from './CategoriaEdit';
import CategoriaList from './CategoriaList';
import ReclamacoesComponent from './components/ReclamacoesComponent';

class App extends Component {
  render() {
    return (
        <Router>
          <Switch>
            <Route path='/' exact={true} component={Home}/>
            <Route path='/categorias' exact={true} component={CategoriaList}/>
            <Route path='/categorias/:id' component={CategoriaEdit}/>
            <Route path='/reclamacoes' exact={true} component={ReclamacoesComponent}/>
          </Switch>
        </Router>
    )
  }
}

export default App;
