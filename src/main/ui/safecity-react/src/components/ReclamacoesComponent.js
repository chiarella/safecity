import React from 'react';
import ReclamacoesService from '../services/ReclamacoesService';

class ReclamacoesComponent extends React.Component{

    constructor(props){
        super(props)
        this.state = {
            reclamacoes:[]
        }
    }

    componentDidMount(){
        ReclamacoesService.getReclamacoes().then((response) => {
            this.setState({ reclamacoes: response.data})
        });
    }

    render(){
        return (
            <div>
                <h1 className = "text-center"> Lista de reclamações</h1>
                <table className = "table table-striped">
                    <thead>
                        <tr>
                            <td>Id</td>
                            <td>Titulo</td>
                            <td>Categoria</td>
                            <td>Descrição</td>
                            <td>Data Cadastro</td>
                        </tr>                           
                    </thead>                
                    <tbody>
                        {
                            this.state.reclamacoes.map(
                                reclamacao =>
                                <tr key = {reclamacao.idReclamacao}>
                                    <td> {reclamacao.idReclamacao} </td>
                                    <td> {reclamacao.titulo}</td>
                                    <td> {reclamacao.idCategoria} </td>
                                    <td> {reclamacao.descricaoReclamacao} </td>
                                    <td> {reclamacao.dataCadastro} </td>
                                </tr>
                                )
                            }
                        </tbody>
                    </table> 
            </div>
        )
    }
}

export default ReclamacoesComponent